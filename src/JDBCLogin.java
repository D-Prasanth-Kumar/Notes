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
        // NOTE ----
        // we can also get the names of columns by doing - ResultSetMetaData metaData = rs.getMetaData();
        // now metaData.getColumnCount() - gives the count/ no of columns
        // and metaData.getColumnName() - gives the name of the column
        // ----
        //

        System.out.println("User Signed up...");

        // -----
        // NOTE (Check D3 MetaData Class) - handle the constants like url, username, password
        // and connection and statement with methods in separate packages like util, constant...
        // helps in organizing our project in clear way (good architecture)
        // Try this too..
        // -----
    }
}
