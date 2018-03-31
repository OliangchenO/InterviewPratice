package com.interview.jdbc;

import lombok.extern.slf4j.Slf4j;

import java.sql.*;

@Slf4j
public class JdbcTest {
    /**
     * 使用JDBC连接并操作mysql数据库
     * 1，加载驱动
     2，通过DriverManager对象获取连接对象Connection
     3，通过连接对象获取会话
     4，通过会话进行数据的增删改查，封装对象
     5，关闭资源
     */
    public static void main(String[] args){
        // 数据库驱动类名的字符串
        String driver = "com.mysql.jdbc.Driver";
        // 数据库连接串
        String url = "jdbc:mysql://127.0.0.1:3306/xmall";
        // 用户名
        String username = "root";
        // 密码
        String password = "root";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            // 1、加载数据库驱动（ 成功加载后，会将Driver类的实例注册到DriverManager
            Class.forName(driver);
            // 2、获取数据库连接
            conn = DriverManager.getConnection(url, username, password);
            // 3、获取数据库操作对象
            stmt = conn.createStatement();
            // 4、定义操作的SQL语句
            String sql = "Select * from tb_user where id=1";
            // 5、执行数据库操作
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("username"));
            }
        }catch (Exception e){
            log.error(e.getMessage(), e);
        }finally {
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    log.error(e.getMessage(), e);
                }
            }
            if(stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }  
    
}
