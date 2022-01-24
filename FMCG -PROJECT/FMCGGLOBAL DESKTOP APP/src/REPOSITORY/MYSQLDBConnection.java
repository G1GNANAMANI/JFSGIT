package REPOSITORY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQLDBConnection {
	public static Connection getConnection() {
		Connection connection = null;
		try {
//			LOAD THE DRIVER
			Class.forName("com.mysql.cj.jdbc.Driver");
//			ESTABLISH THE CONNECTION
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/FMCGGLOBAL", "root", "mysql");
//			System.out.println("Connection established");
		} catch (ClassNotFoundException classNotFoundException) {
			System.out.println("Driver could not be loaded " + classNotFoundException);
		} catch (SQLException sqlException) {
			System.out.println("Database Connection Problems : " + sqlException);
		}
		return connection;
	}

	public static ResultSet getResultSet(String selectQuery) {
		try {
//			GET CONNECTION
			Connection connection = getConnection();
			// CREATE THE STATEMENT
			Statement statement = connection.createStatement();
			// EXECUTE THE QUERY AND GET THE RESULT SET
			ResultSet resultSet = statement.executeQuery(selectQuery);
			return resultSet;
		} catch (SQLException sqlException) {
			System.out.println("Cannot execute query : " + sqlException);
		}
		return null;
	}
	public static int saveRecord(String insertQuery) {
		int rowsInserted = 0;
		try {
			// CREATE THE STATEMENT
			Statement statement = getConnection().createStatement();
			// EXECUTE THE QUERY AND GET THE RESULT SET
			rowsInserted  = statement.executeUpdate(insertQuery);
			
			// CHECK IF DATA IS INSERTED SUCCESSFULLY 
			if(rowsInserted > 0 ) {
				System.out.println("THE GIVEN RECORD HAS BEEN INSERTED SUCCESSFULLY!!!!");
			}
			else
			{
				System.out.println("THE RECORD COULD NOT BE INSERTED....");
			}
		} catch (SQLException sqlException) {
			System.out.println("CANNOT EXECUTE THE QUERY : " + sqlException);
		}
		return rowsInserted;
	}

	public static int Insertion(String insertQuery) {    //MySQLDBConnection.Insertion(String insertQuery)
		int Result=0;
		try {
			// CREATE THE STATEMENT
			Statement statement = getConnection().createStatement();
			// UPDATE THE QUERY AND GET THE resultSetofinsert
			   Result = statement.executeUpdate(insertQuery);
		} catch (SQLException sqlException) {
			System.out.println("CANNOT BE UPDATED : " + sqlException);
		}
		return  Result;
	}
}