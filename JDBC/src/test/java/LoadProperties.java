import lesson02.utils.JdbcUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties {
    public static void main(String[] args) {
        String driver=null;
        String url=null;
        String username=null;
        String password=null;

        try {
            InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream("db.properties");
            Properties properties = new Properties();
            properties.load(in);

            url = properties.getProperty("url");
            driver = properties.getProperty("driver");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
        } catch (NullPointerException | IOException e){
            e.printStackTrace();
        }

    }


}
