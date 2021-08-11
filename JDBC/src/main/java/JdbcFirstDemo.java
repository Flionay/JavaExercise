import java.sql.*;

public class JdbcFirstDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. 加载驱动
        Class.forName("com.mysql.jdbc.Driver"); // 固定写法 加载驱动

        // 2. url 账号密码
        String url = "jdbc:mysql://localhost:3306/mybatis?useUnicode=true&characterEncoding=utf8&useSSL=false";
        String username = "root";
        String password = "123456";

        // 3. 连接成功，数据库对象
        Connection connection = DriverManager.getConnection(url, username, password);

        // 4. 执行sql语句的对象

        Statement statement = connection.createStatement();

        //5. 执行
        String sql = "SELECT * FROM user";
        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()){
            System.out.println("id: "+resultSet.getObject("id"));
            System.out.println("name: "+resultSet.getObject("name"));
            System.out.println("pwd: "+resultSet.getObject("pwd"));
            System.out.println("===================");
        }

        //6. 释放对象
        resultSet.close();
        statement.close();
        connection.close();

    }

}
