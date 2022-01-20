//select
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class SelectStatements {
	public static void main(String[] args) {
        // Establish a connection
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Gnanam", "root", "mysql");
            System.out.println("Connected Successfully");
            //CREATE THE SQL QUERY STRING
            String sqlSelect = "SELECT BOOK_ID, BOOK_NAME,BOOK_PRICE FROM BOOK";
            // CREATE THE STATEMENT
            Statement statement = connection.createStatement();
            //Execute the query and get the result set
            ResultSet resultset = statement.executeQuery(sqlSelect);
            //Iterate through the result set and display the data
            while(resultset.next())
            {
            	int BOOK_ID = resultset.getInt("BOOK_ID");
            	String BOOK_NAME = resultset.getString("BOOK_NAME");
            	float BOOK_PRICE = resultset.getFloat("BOOK_PRICE");
            	System.out.println(BOOK_ID + BOOK_NAME +" "+ BOOK_PRICE);
            	
            }
           
            
        } catch (SQLException sqlException) {
            System.out.println("Database Connection Problems1  " + sqlException);
        }
    }

}
