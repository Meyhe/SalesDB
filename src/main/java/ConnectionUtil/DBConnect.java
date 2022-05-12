package ConnectionUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    private static DBConnect INSTANCE;
    private Connection connection;

    private static final String url = "jdbc:h2:tcp://localhost/~/test";
    private static final String username = "sa";
    private static final String password = "";
    private static final String driver = "org.h2.Driver";

    private DBConnect() throws SQLException {
        try {
            Class.forName(driver);
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static DBConnect getInstance() throws SQLException {
        if (INSTANCE == null) {
            INSTANCE = new DBConnect();
        } else if (INSTANCE.getConnection().isClosed()) {
            INSTANCE = new DBConnect();
        }
        return INSTANCE;
    }
}