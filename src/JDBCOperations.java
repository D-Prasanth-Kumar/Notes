import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCOperations {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // STEPS :
        // -- import Packages; --
        // Load and Register Drivers;
        // Establish Connection;
        // Create Statement;
        // Prepare SQL Query;
        // Execute;
        // Close all resources;

        System.out.println("Started Driver Registration...");

        // #1
        Class.forName("com.mysql.cj.jdbc.Driver");

        System.out.println("Driver registered...");

        // #2
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String username = "root";
        String password = "Prax@1234";

        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println("Connection created...");

        // #3
        Statement statement = connection.createStatement();

        // #4
        statement.executeUpdate("insert into demo values(2, 'Ram')");
    }
}