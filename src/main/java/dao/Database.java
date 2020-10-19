package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Brenda Nyaswa
 */
public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/ngo";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    public static Connection connect(){
        try {
            try {
                Class.forName(DRIVER);
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Database connection error");
            }
            DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
