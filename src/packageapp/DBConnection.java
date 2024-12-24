
package packageapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class DBConnection {
    public static Connection getConnection() throws SQLException{
        String DB_URL = "jdbc:mysql://localhost:3306/appjava";
        String USER_NAME = "root";
        String PASSWORD = "";
        return DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
    }
}
