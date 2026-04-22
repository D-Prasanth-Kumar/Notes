// initially we used Statement, but with Statement there is possibility of getting effected with
// 'SQL Injection'. to overcome that, 'Prepared Statement' is introduced.
// Prepared Statement is like an extension for Statement. it comes with a pre-compiled query.

// In Statement, we first create statement, and then prepare query and we execute.
// but in Prepared Statement, we first prepare query, and then create statement and execute.

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatement {
    public static void main(String[] args) throws SQLException {

        // if we handle boilerplate code in separate util package, the code will looks like,
        Connection connection = DatabaseConnection.getConnection();

        // Ex: "Insert into users values(?, ?, ?)";
        String query = "SELECT * from users where id = ? and name = ?"; // we can inject values dynamically instead of hardcoding with '?'
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, 2); // 1 -> will be which ? ,and 2 -> is the value
        statement.setString(2, "Prasanth");

        ResultSet rs = statement.executeQuery();

        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(1));
        }

        // there are also addBatch() and executeBatch() methods which helps in adding in batches and
        // execute as batches.

        // NOTE ----
        // When we are working on storedProcedures we use Callable Statement.
        // Ex: CallableStatement callableStatement = connection.prepareCall("{CALL insertProduct(4, 'Mobile', 15000)}");
        //     callableStatement.execute();
        // -- check D5 Stored Procedures class --
        //
    }
}
