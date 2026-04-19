import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCLogin {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String username = "root";
        String password = "Prax@1234";

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username: ");

        String userName = sc.nextLine();

        System.out.println("Enter password: ");

        String userPassword = sc.nextLine();

        // INSERT INTO users values(1, 'Prasanth', 'xyz'); - original command
        statement.executeUpdate("Insert into users values(1, '"+ userName +"', '"+ userPassword +"')");

        //
        // for login
        // ResultSet rs = statement.executeQuery("SELECT * from users " + "where username = '" + userName + "' and userPassword = '" + userPassword + "');
        // if(rs.next()) System.out.println("User Logged in...");
        // else System.out.println("Invalid Credentials...");
        //

        System.out.println("User Signed up...");
    }
}
