import java.sql.*;

public class JDBC2 {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbcdemo";
            String username = "root";
            String password = "root";

            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("Select * from demo");

            while(rs.next()) {
                int id = rs.getInt(1); // 1 -> columnindex / 1st column ; instead of column numbers we can also give column names here.
                String name = rs.getString(2); // 2 -> 2nd column

                System.out.println(id + " " + name);
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            connection.close();
            statement.close();
        }
    }
}