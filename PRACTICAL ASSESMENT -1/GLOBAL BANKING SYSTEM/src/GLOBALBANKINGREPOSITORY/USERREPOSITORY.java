package GLOBALBANKINGREPOSITORY;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import GLOBALBANKINGMODEL.USERS;

public class USERREPOSITORY {;

	public static List<USERS> findAll() {
		// LIST TO STORE PRODUCTS
		List<USERS> users = new ArrayList<USERS>();
		ResultSet resultSet = MYSQLDBConnection.getResultSet("SELECT * FROM USERS");
		// ITERATE THROUGH THE RESULT SET AND CREATE THE PRODUCT MODEL
		try {
			while (resultSet.next()) {
				String USER_NAME = resultSet.getString("USER_NAME");
				String PASSWORD_ENTRY = resultSet.getString("PASSWORD_ENTRY");
				String CREATION_DATE = resultSet.getString("CREATION_DATE");
				int NUMBER_OF_ACCOUNTS= resultSet.getInt("NUMBER_OF_ACCOUNTS");
				int LIST_OF_ACC_NO = resultSet.getInt("LIST_OF_ACC_NO");
				int TOTAL_BAL = resultSet.getInt("TOTAL_BAL");
		int CONTACT_NO = resultSet.getInt("CONTACT_NO");
				// CREATE A PRODUCT OBJECT FOR THE PRODUCT
				USERS user = new USERS(USER_NAME,PASSWORD_ENTRY,CREATION_DATE,NUMBER_OF_ACCOUNTS,LIST_OF_ACC_NO,TOTAL_BAL,CONTACT_NO);
				USERS.add(users);
			}
			return users;
		} catch (SQLException sqlException) {
			System.out.println("Problem in Result Set " + sqlException);
		}
		return null;
	}
public static USERS save(USERS users) {
	// CREATE THE INSERT QUERY
	String insertQuery = "INSERT INTO USERS VALUES ('" + users.getUserName() + "','"
			+ users.getpasswordEntry() + "'," + users.getCreationDate() + "," + users.getNumberOfAccounts() + "," + users.getListOfAccNo() + "," + users.getTotalBal() + "," + users.getContactNo() +");";
	System.out.println(insertQuery);
	return users;
}
}