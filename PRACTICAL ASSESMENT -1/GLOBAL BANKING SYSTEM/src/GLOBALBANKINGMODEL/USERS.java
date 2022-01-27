package GLOBALBANKINGMODEL;

import java.util.List;

public class USERS extends Object {
	private String USER_NAME;
	private String PASSWORD_ENTRY;
	private String CREATION_DATE;
	private int NUMBER_OF_ACCOUNTS;
	private int LIST_OF_ACC_NO;
	private int TOTAL_BAL;
	private int CONTACT_NO;
		

	public USERS(String USER_NAME, String PASSWORD_ENTRY, String CREATION_DATE, int NUMBER_OF_ACCOUNTS, int LIST_OF_ACC_NO,
			int TOTAL_BAL, int CONTACT_NO) {
		this.USER_NAME = USER_NAME;
		this.PASSWORD_ENTRY = PASSWORD_ENTRY;
		this.CREATION_DATE = CREATION_DATE;
		this.NUMBER_OF_ACCOUNTS= NUMBER_OF_ACCOUNTS;
		this.LIST_OF_ACC_NO =LIST_OF_ACC_NO;
		this.TOTAL_BAL = TOTAL_BAL;
		this.CONTACT_NO = CONTACT_NO;
	

	}

	public String getUserName() {
		return USER_NAME;
	}

	public String getpasswordEntry() {
		return PASSWORD_ENTRY;
	}

	public String getCreationDate() {
		return CREATION_DATE;
	}

	public int getNumberOfAccounts() {
		return NUMBER_OF_ACCOUNTS;
	}

	public int getListOfAccNo() {
		return LIST_OF_ACC_NO;
	}

	public int getTotalBal() {
		return TOTAL_BAL;
	}

	public int getContactNo() {
		return CONTACT_NO;
	}
@Override
public String toString() {
	return "Username: " + USER_NAME + "\nPassword : " + PASSWORD_ENTRY + "\n Creation_date : " + CREATION_DATE + "\nnoofaccount :"  + NUMBER_OF_ACCOUNTS + "\nlistofaccount: " + LIST_OF_ACC_NO + "\ntotalbalance : "
			+ TOTAL_BAL +  "\ncontactnumber :" +  CONTACT_NO+ "\n" ;
				
}

public static void add(List<USERS> users) {
	
}
}

