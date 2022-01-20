package INTERFACE;

public class Class_AbstractClass_Interface {
	public static void main(String[] args) {
		//Account account;
//		Cannot instantiate the type Account
//		account = new Account();
		//NetBanking netBanking;
	//	cannot instantiate the type NetBanking
		//netBanking = new NetBanking();
		System.out.println("USING SAVINGS ACCOUNT");
		Account account = new SavingsAccount();
		account.displayAccountInfo();
		account.displayBankDetails();
		
		System.out.println("USING CURRENT ACCOUNT");
		 account = new CurrentAccount();
		account.displayAccountInfo();
		account.displayBankDetails();
		
		//USING NETBANKING
		System.out.println("USING NET BANKING");
		NetBanking  netBanking = null;
		netBanking = new SavingsAccount();
		netBanking.transferAmount();
		
		// USING DEBIT CARD
		System.out.println("USING DEBIT CARD");
		DebitCard  debitcard = null;
		debitcard = new SavingsAccount();
		debitcard.withdrawAmount();
		
		//USING SAVINGS ACCOUNT
		SavingsAccount savingsAccount = null;
		savingsAccount = new SavingsAccount();
		System.out.println("USING SAVINGS ACCOUNT");
		savingsAccount.displayAccountInfo();
		savingsAccount.transferAmount();
		savingsAccount.displayBankDetails();
		savingsAccount.withdrawAmount();
	}
}
//INTERFACES HAVE ABSTRACT METHODS
interface NetBanking {
	public abstract void transferAmount();
}
//INTERFACES HAVE ABSTRACT METHODS
interface DebitCard {
	public abstract void withdrawAmount();
}
// abstract class cannot be instantiated
// inheritance is the purpose of abstract classes
abstract class Account {
//	Abstract methods do not specify a body
//	public abstract void displayAccountInfo() {
//		
//	}
	public abstract void displayAccountInfo();
	public void displayBankDetails() {
		System .out.println("CANRA BANK");
	}
}
//A CLASS CAN EXTEND FROM ONLY ONE CLASS BUT CAN IMPLEMENT MULTIPLE INTERFACE
class SavingsAccount extends Account implements NetBanking,DebitCard {
	//override the abstract method
	@Override
	public void displayAccountInfo() {
		System.out.println("SAVINGS ACCOUNT INFO");
	}
	@Override
	public void transferAmount() {
		System.out.println("TRANSFER AMOUNT FROM SAVINGS BANK ACCOUNT USING NETBANKING");
	}
	public void withdrawAmount() {
		System.out.println("WITHDRAW AMOUNT FROM SAVINGS BOOK ACCOUNT USING DEBITCARD ");
	}
}
class CurrentAccount extends Account {
	//override the abstract method
	@Override
	public void displayAccountInfo() {
		System.out.println("CURRENT ACCOUNT INFO");
	}
}