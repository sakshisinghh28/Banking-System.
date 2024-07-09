package bank.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseUtils {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/bank";
    private static final String USER = "root";
    private static final String PASS = "password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Add methods for CRUD operations on the database
    public static void saveAccount(BankAccount account) {
        // Implement save logic using PreparedStatement
    }

    public static BankAccount getAccount(long accountNumber) {
        // Implement retrieval logic using PreparedStatement
        return null;
    }
}
