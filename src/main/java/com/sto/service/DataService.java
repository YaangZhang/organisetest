package com.sto.service;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

/**
 * 批量导入数据
 */
@Service
public class DataService {

    private final int mulSize = 10;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public long batchInsert(BlockingQueue<T> dataList, String sql, Object[] params1, Object[] params2){
        String insertSqlStr = genMulFixSqlStr(mulSize, sql);
        List<T> userList = new ArrayList<>();
        long beginTime = System.currentTimeMillis();
        try {
            while (!dataList.isEmpty()) {
                T user = dataList.take();
                userList.add(user);
                if (userList.size() == mulSize) {
                    jdbcTemplate.update(insertSqlStr, params1);
                    userList.clear();
                }
            }
            //插入剩余的数据
            if (!userList.isEmpty()) {
                String restInsertSql = genMulFixSqlStr(userList.size(), sql);
                jdbcTemplate.update(restInsertSql, params2);
                userList.clear();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        return endTime - beginTime;
    }


    /**
     * 拼接SQL 每次 insert mulSize 条
     * @param sql
     * @return
     */
    private String genMulFixSqlStr(int mulSize, String sql) {
        StringBuffer mulInserSql = new StringBuffer();
        mulInserSql.append(sql);
        String value = null;
        String[] sqls = sql.split("VALUES");
        if (sqls.length > 1) {
            value = sqls[1];
        }
        for (int i = 1; i < mulSize; i++) {
            mulInserSql.append("," + value);
        }
        return mulInserSql.toString();
    }

    public static void main(String[] args) {
//        genMulFixSqlStr("INSERT INTO `user` (`id`, `user_name`, `pass_word`, `age`, `city`, `email`, `nick_name`, `reg_time`) VALUES (?,?,?,?,?,?,?,?)");
    }
}
