package com.sto;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.sql.*;
  
public class Main {  
    private static String URL = "jdbc:mysql://47.100.21.53:3306/ordertest";
    private static String USERNAME = "root";
    private static String PWD = "root123";
    private static int MAX = 10000;
    private static String SQL = "insert into user (`id`, `user_name`, `pass_word`, `age`, `city`, `email`, `nick_name`, `reg_time`) values(?,?,?,?,?,?,?,?)";
  
    public static void main(String[] args) throws ClassNotFoundException, SQLException, UnsupportedEncodingException {  
        long start = System.currentTimeMillis();
//        testBatchInsert(100);
        testInsert();
        long end = System.currentTimeMillis();  
        System.out.println(MAX + " 条数据用时 " +(end - start));
        System.out.println(" 每秒用时 "+(MAX / (end - start)));
    }  
  
    private static Connection getConnection() throws SQLException, ClassNotFoundException {  
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(URL, USERNAME, PWD);  
        return con;
    }  
  
    private static void testInsert() throws ClassNotFoundException, SQLException {  
        Connection con = getConnection();  
        con.setAutoCommit(false);  
        PreparedStatement pt = con.prepareStatement(SQL);  
        int i = 0;  
        while (i < MAX) {
            pt.setInt(1, i);
            pt.setString(2, RandomStringUtils.randomAscii(20));
            pt.setString(3, RandomStringUtils.randomAscii(200));
            pt.setInt(4, 1 + i);
            pt.setString(5, "shanghai"+i);
            pt.setString(6, i+"78945@qq.com");
            pt.setString(7, RandomStringUtils.randomAscii(100));
            pt.setDate(8, new Date(System.currentTimeMillis()));
            pt.executeUpdate();  
            con.commit();  
            i++;  
        }  
        con.close();  
    }  
  
    private static void testInsertAutoCommit() throws ClassNotFoundException, SQLException {  
        Connection con = getConnection();  
        con.setAutoCommit(true);  
        PreparedStatement pt = con.prepareStatement(SQL);  
        int i = 0;  
        while (i < MAX) {  
            pt.setLong(1, 1 + (int) (Math.random() * 100000000));  
            pt.setLong(2, 1 + (int) (Math.random() * 100000000));  
            pt.setString(3, RandomStringUtils.randomAscii(200));  
            pt.setInt(4, 1);  
            pt.setInt(5, 1);  
            pt.setInt(6, 1);  
            pt.setInt(7, 1);  
            pt.executeUpdate();  
            i++;  
        }  
        con.close();  
    }  
  
    private static void testBatchInsert(int batchSize) throws ClassNotFoundException, SQLException {  
        Connection con = getConnection();  
        con.setAutoCommit(false);  
        PreparedStatement pt = con.prepareStatement(SQL);  
        int i = 0;  
        while (i < MAX) {  
            pt.setInt(1, i);
            pt.setString(2, RandomStringUtils.randomAscii(20));
            pt.setString(3, RandomStringUtils.randomAscii(200));  
            pt.setInt(4, 1 + i);
            pt.setString(5, "shanghai"+i);
            pt.setString(6, i+"78945@qq.com");
            pt.setString(7, RandomStringUtils.randomAscii(100));
            pt.setDate(8, new Date(System.currentTimeMillis()));
            pt.addBatch();
            if (i % batchSize == 1) {  
                pt.executeBatch();  
                con.commit();  
            }  
            i++;  
        }  
        pt.executeBatch();  
        con.commit();  
        con.close();  
    }  
  
    private static void testLoadFile(int batchSize)  
            throws ClassNotFoundException, SQLException, UnsupportedEncodingException {  
        String fieldsterminated = "\t\t";  
        String linesterminated = "\t\r\n";  
        String loadDataSql = "LOAD DATA LOCAL INFILE 'sql.csv' INTO TABLE chat_message FIELDS TERMINATED BY '"  
                + fieldsterminated + "'  LINES TERMINATED BY '" + linesterminated  
                + "' (src_userid,target_userid,message,s1,s2,s3,s4) ";  
        Connection con = getConnection();  
        con.setAutoCommit(false);  
        PreparedStatement pt = con.prepareStatement(loadDataSql);
        PreparedStatement preparedStatement = null;
        if (pt.isWrapperFor(Statement.class)) {
            preparedStatement = pt.unwrap(PreparedStatement.class);
        }

//        com.mysql.jdbc.PreparedStatement mysqlStatement = null;
//        if (pt.isWrapperFor(com.mysql.jdbc.Statement.class)) {
//            mysqlStatement = pt.unwrap(com.mysql.jdbc.PreparedStatement.class);
//        }
  
        int i = 0;  
        StringBuilder sb = new StringBuilder(10000);  
        while (i < MAX) {  
            sb.append(1 + (int) (Math.random() * 100000000));  
            sb.append(fieldsterminated);  
            sb.append(1 + (int) (Math.random() * 100000000));  
            sb.append(fieldsterminated);  
            sb.append(RandomStringUtils.randomAscii(200).replaceAll("\\\\", " "));  
            sb.append(fieldsterminated);  
            sb.append(1);  
            sb.append(fieldsterminated);  
            sb.append(1);  
            sb.append(fieldsterminated);  
            sb.append(1);  
            sb.append(fieldsterminated);  
            sb.append(1);  
            sb.append(linesterminated);  
            if (i % batchSize == 1) {  
                byte[] bytes = sb.toString().getBytes();  
                InputStream in = new ByteArrayInputStream(bytes);  
//                mysqlStatement.setLocalInfileInputStream(in);
//                mysqlStatement.executeUpdate();
                preparedStatement.setAsciiStream(0, in);
                preparedStatement.executeUpdate();
                con.commit();  
                sb = new StringBuilder(10000);  
            }  
  
            i++;  
        }  
        byte[] bytes = sb.toString().getBytes();  
        InputStream in = new ByteArrayInputStream(bytes);  
//        mysqlStatement.setLocalInfileInputStream(in);
//        mysqlStatement.executeUpdate();
        preparedStatement.setAsciiStream(0, in);
        preparedStatement.executeUpdate();
        con.commit();
        con.close();  
    }  
}