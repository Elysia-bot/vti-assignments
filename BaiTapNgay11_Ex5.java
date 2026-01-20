package BaiTapNgay11.Exercise5;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class a {
    public class JdbcUtils {
        private Connection connection;

        public void isConnectedForTesting() throws Exception {
            connect();
            System.out.println("Connect success!");
        }

        public Connection connect() throws Exception {
            if (connection == null || connection.isClosed()) {
                Properties properties = new Properties();
                properties.load(new FileInputStream("database.properties"));

                String url = properties.getProperty("url");
                String user = properties.getProperty("username");
                String pass = properties.getProperty("password");

                connection = DriverManager.getConnection(url, user, pass);
            }
            return connection;
        }

        public void disconnect() throws Exception {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

}
