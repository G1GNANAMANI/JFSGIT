// delete
package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DeleteStatement {
	public static void main(String[] args) {
        // Establish a connection
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Gnanam", "root", "mysql");
            System.out.println("Connected Successfully");
            //CREATE THE SQL QUERY STRING
            String sqlDelete = "DELETE FROM BOOK WHERE BOOK_ID = 12;";
;
            // CREATE THE STATEMENT
            Statement statement = connection.createStatement();
            //Execute the query and get the result set
            int rowsaffected = statement.executeUpdate(sqlDelete);
            //Iterate through the result set and display the data
          if (rowsaffected > 0)
          {
        	  System.out.println("Deleted record successfully");
          }
        	  else {
        		  System.out.println("records could not be deleted");
        	  }
			
          
            
        } catch (SQLException sqlException) {
            System.out.println("Database Connection Problems " + sqlException);
        }
    }
}


