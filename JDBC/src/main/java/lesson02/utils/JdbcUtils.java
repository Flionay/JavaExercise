package lesson02.utils;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils {
    private static String driver=null;
    private static String url=null;
    private static String username=null;
    private static String password=null;

    static {
        try {
            InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream("db.properties");
            Properties properties = new Properties();
            properties.load(in);

            url = properties.getProperty("url");
            driver = properties.getProperty("driver");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
       return DriverManager.getConnection(url, username, password);
    }

    // 释放连接资源

    public static void release(Connection conn, Statement state, ResultSet result){
        if(result!=null){
            try {
                result.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (state!=null){
            try {
                state.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn!=null){
            try {
                state.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
