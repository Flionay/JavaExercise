package lesson02;

import lesson02.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
    public static void main(String[] args) {
        Connection conn=null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            conn = JdbcUtils.getConnection();
            statement = conn.createStatement();
            String sql = "INSERT INTO user(id, name, pwd) VALUE(5,'me','1kkkkk')";
            int i = statement.executeUpdate(sql);
            if(i>0){
                System.out.println("插入成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.release(conn,statement,rs);
        }
    }
}
