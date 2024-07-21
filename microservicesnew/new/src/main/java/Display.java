
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Display {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
            connection = ConnectDb.getConnection();
            statement = connection.createStatement();
            String query = "SELECT * FROM actor"; 
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {

                int id = resultSet.getInt("actor_id");
                String fname = resultSet.getString("first_name");
                String lname = resultSet.getString("last_name");
                int add = resultSet.getInt("address_id");
                
                // Print or process each row
                System.out.println("ID: " + id + ", first Name: " + fname + ", add: " + add);
            }
        }
        
}


