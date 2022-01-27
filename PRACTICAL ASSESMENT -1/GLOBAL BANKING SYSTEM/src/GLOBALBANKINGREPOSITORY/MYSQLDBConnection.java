package GLOBALBANKINGREPOSITORY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQLDBConnection {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/BANK", "root", "mysql");
		    System.out.println("Connection established");
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