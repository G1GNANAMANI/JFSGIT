//Update
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStatement {
	
	public static void main(String[] args) {
        // Establish a connection
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Gnanam", "root", "mysql");
            System.out.println("Connected Successfully");
            //CREATE THE SQL QUERY STRING
            String sqlUpdate = "UPDATE BOOK SET BOOK_NAME ='THE WINGS OF FIRE ' WHERE BOOK_ID = 11;";
            // CREATE THE STATEMENT
            Statement statement = connection.createStatement();
            //Execute the query and get the result set
            int rowsaffected = statement.executeUpdate(sqlUpdate);
            //Iterate through the result set and display the data
          if (rowsaffected > 0)
          {
        	  System.out.println("updated records successfully");
          }
        	  else {
        		  System.out.println("records could not be updated");
        	  }
			
          
            
        } catch (SQLException sqlException) {
            System.out.println("Database Connection Problmens " + sqlException);
        }
    }
}


