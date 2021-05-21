package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {

    private static final String URL_KEY = "jdbc:mysql://localhost:3306/md?useUnicode=true&serverTimezone=UTC";
    private static final String LOGIN_KEY = "root";
    private static final String PASSWORD_KEY = "root";


    static {
        loadDriver();
    }

    private ConnectionManager() {
    }

    public static Connection open() {
        try {
            return DriverManager.getConnection(
                    URL_KEY,
                    LOGIN_KEY,
                    PASSWORD_KEY);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static synchronized void loadDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver loading failure!!!!((((");
            throw new RuntimeException(e);

        }
    }


}
