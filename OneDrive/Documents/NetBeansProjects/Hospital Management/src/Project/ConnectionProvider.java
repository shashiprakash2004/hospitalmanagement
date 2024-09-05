package Project;
import java.sql.*;

/**
 * ConnectionProvider class to establish a connection with the database.
 * 
 * @author rohit
 */
public class ConnectionProvider {

    /**
     * Establishes and returns a connection to the MySQL database.
     * 
     * @return Connection object or null if an exception occurs.
     */
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital management", "root", "");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}