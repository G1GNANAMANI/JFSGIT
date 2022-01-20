// insert
package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;




public class InsertStatement {
	public static void main(String[] args) {
        // Establish a connection
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Gnanam", "root", "mysql");
            System.out.println("Connected Successfully");
            //CREATE THE SQL QUERY STRING
            String sqlInsert = "INSERT INTO BOOK VALUES(11,'BARBIE',100.7,'YES');";
            // CREATE THE STATEMENT
            Statement statement = connection.createStatement();
            //Execute the query and get the result set
            int rowsaffected = statement.executeUpdate(sqlInsert);
            //Iterate through the result set and display the data
          if (rowsaffected > 0)
          {
        	  System.out.println("Inserted rows successfully");
          }
        	  else {
        		  System.out.println("records could not be inserted");
        	  }
			
          
            
        } catch (SQLException sqlException) {
            System.out.println("Database Connection Problmens " + sqlException);
        }
    }
	

}
