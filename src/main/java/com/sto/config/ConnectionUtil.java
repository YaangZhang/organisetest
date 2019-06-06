/**
 * Copyright (C), 2015-2019, 申雪供应链有限公司
 * FileName: ConnectionUtil
 * Author:   Administrator
 * Date:     2019-04-17 13:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sto.config;/**
 * Created by Administrator on 2019-04-17.
 */

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

/**
 * 〈获取数据库连接工具类〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2019-04-17
 * @since 1.0.0
 */
public class ConnectionUtil {

    /**
     * 获取oracle连接
     */
    public static Connection getOracleCon() throws ClassNotFoundException, SQLException {
        // Connection conn = null;
        String DRIVER = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@192.168.126.200:1521:wutong";
        String user = "wutong";
        String password = "wutong";
        Class.forName(DRIVER);
        return DriverManager.getConnection(url, user, password);
    }

    /**
     * 获取mysql 连接
     */
    public static Connection getMysqlCon()throws ClassNotFoundException, SQLException{
        // Connection conn = null;
        String DRIVER = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://47.100.21.53:3306/ordertest?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8";
        String user = "root";
        String password = "root123";
        Class.forName(DRIVER);
        return DriverManager.getConnection(url, user, password);
    }

    public static List<List<String>> tableInput() {
        List<List<String>> dataList = new ArrayList<>();
        PreparedStatement pre = null;
        ResultSet resultSet = null;
        Connection oracleCon = null;
        String sql = "select ID, ORDER_ID,BILL_CODE,REC_SITE_ID,REC_SITE_CODE,REC_SITE_NAME,ASSIGN_SITE_ID,ASSIGN_SITE_CODE,ASSIGN_SITE_NAME,ORDER_SOURCE,ORDER_DATE,ASSIGN_DATE,SEND_NAME,SEND_PHONE,SEND_ADDRESS,SEND_PROV_ID,SEND_PROV,SEND_CITY_ID,SEND_CITY,SEND_AREA_ID,SEND_AREA,REC_ADDRESS,REC_NAME,REC_PHONE,REC_MOBILE,REC_PROV_ID,REC_PROV,REC_CITY_ID,REC_CITY,REC_AREA_ID,REC_AREA,REC_MAN_CODE,REC_MAN,ASSIGN_MAN_CODE,ASSIGN_MAN,DATOUBI,SIGN_DATE,DISP_MAN,DISP_MAN_CODE,CREATE_ON,ASSIGN_CENTER_CODE,ASSIGN_CENTER_NAME,CREATE_COMPANY,ASSIGN_MAN_PHONE,PRINT_CODE,JI_BAO FROM  STO_ORDER_CALL where SEND_CITY = '大连市'";
        try {
            oracleCon = getOracleCon();
            pre = oracleCon.prepareStatement(sql);
            resultSet = pre.executeQuery();
            String[] columu = {"ID", "ORDER_ID","BILL_CODE","REC_SITE_ID","REC_SITE_CODE","REC_SITE_NAME","ASSIGN_SITE_ID","ASSIGN_SITE_CODE","ASSIGN_SITE_NAME","ORDER_SOURCE","ORDER_DATE","ASSIGN_DATE","SEND_NAME","SEND_PHONE","SEND_ADDRESS","SEND_PROV_ID","SEND_PROV","SEND_CITY_ID","SEND_CITY","SEND_AREA_ID","SEND_AREA","REC_ADDRESS","REC_NAME","REC_PHONE","REC_MOBILE","REC_PROV_ID","REC_PROV","REC_CITY_ID","REC_CITY","REC_AREA_ID","REC_AREA","REC_MAN_CODE","REC_MAN","ASSIGN_MAN_CODE","ASSIGN_MAN","DATOUBI","SIGN_DATE","DISP_MAN","DISP_MAN_CODE","CREATE_ON","ASSIGN_CENTER_CODE","ASSIGN_CENTER_NAME","CREATE_COMPANY","ASSIGN_MAN_PHONE","PRINT_CODE","JI_BAO"};
            int i = 0;
            while (resultSet.next()) {
                List<String> minList = new ArrayList<>();
                for (String each : columu) {
                    minList.add(resultSet.getString(each));
                }
                dataList.add(minList);
                i++;
                if (i%10000 == 0) { //设置的每次提交大小为10000
                    executeManySql(dataList);
                    dataList.removeAll(dataList);
                    System.out.println(i);
                }
            }
            executeManySql(dataList);////最后别忘了提交剩余的
            return dataList;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                pre.close();// 关闭Statement
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                oracleCon.close();// 关闭Connection
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void executeManySql(List<List<String>> dataList) throws SQLException, ClassNotFoundException {
        Connection mysqlCon = getMysqlCon();
        mysqlCon.setAutoCommit(false);
        String sql = "insert into base_order_call (ID, ORDER_ID,BILL_CODE,REC_SITE_ID,REC_SITE_CODE,REC_SITE_NAME,ASSIGN_SITE_ID,ASSIGN_SITE_CODE,ASSIGN_SITE_NAME,ORDER_SOURCE,ORDER_DATE,ASSIGN_DATE,SEND_NAME,SEND_PHONE,SEND_ADDRESS,SEND_PROV_ID,SEND_PROV,SEND_CITY_ID,SEND_CITY,SEND_AREA_ID,SEND_AREA,REC_ADDRESS,REC_NAME,REC_PHONE,REC_MOBILE,REC_PROV_ID,REC_PROV,REC_CITY_ID,REC_CITY,REC_AREA_ID,REC_AREA,REC_MAN_CODE,REC_MAN,ASSIGN_MAN_CODE,ASSIGN_MAN,DATOUBI,SIGN_DATE,DISP_MAN,DISP_MAN_CODE,CREATE_ON,ASSIGN_CENTER_CODE,ASSIGN_CENTER_NAME,CREATE_COMPANY,ASSIGN_MAN_PHONE,PRINT_CODE,JI_BAO) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement =(PreparedStatement) mysqlCon.prepareStatement(sql);
        for (List<String> stringList : dataList) {
            for (int i = 0; i < stringList.size(); i++) {
                statement.setString(i+1, stringList.get(i));
            }
            // 把一个SQL命令加入命令列表
            statement.addBatch();
        }
        // 执行批量更新
        statement.executeBatch();
        // 语句执行完毕，提交本事务
        mysqlCon.commit();
        statement.close();
        mysqlCon.close();//一定要记住关闭连接，不然mysql回应为too many connection自我保护而断开。

    }

    public static void main(String[] args) {
        String[] columu = {"ID", "ORDER_ID","BILL_CODE","REC_SITE_ID","REC_SITE_CODE","REC_SITE_NAME","ASSIGN_SITE_ID","ASSIGN_SITE_CODE","ASSIGN_SITE_NAME","ORDER_SOURCE","ORDER_DATE","ASSIGN_DATE","SEND_NAME","SEND_PHONE","SEND_ADDRESS","SEND_PROV_ID","SEND_PROV","SEND_CITY_ID","SEND_CITY","SEND_AREA_ID","SEND_AREA","REC_ADDRESS","REC_NAME","REC_PHONE","REC_MOBILE","REC_PROV_ID","REC_PROV","REC_CITY_ID","REC_CITY","REC_AREA_ID","REC_AREA","REC_MAN_CODE","REC_MAN","ASSIGN_MAN_CODE","ASSIGN_MAN","DATOUBI","SIGN_DATE","DISP_MAN","DISP_MAN_CODE","CREATE_ON","ASSIGN_CENTER_CODE","ASSIGN_CENTER_NAME","CREATE_COMPANY","ASSIGN_MAN_PHONE","PRINT_CODE","JIBAO"};
        System.out.println(columu.length);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss:SS");
        TimeZone t = sdf.getTimeZone();
        t.setRawOffset(0);
        sdf.setTimeZone(t);
        Long startTime = System.currentTimeMillis();
        //此段为要放置测取时间的函数
        // mysqlConnection.executeSql("TRUNCATE table disease_drug_associate_view");
        List<List<String>> newDrug = tableInput();

        Long endTime = System.currentTimeMillis();
        System.out.println("用时：" + sdf.format(new Date(endTime - startTime)));

    }

}
