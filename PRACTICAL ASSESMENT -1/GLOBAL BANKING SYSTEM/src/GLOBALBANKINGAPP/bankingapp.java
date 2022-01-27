package GLOBALBANKINGAPP;

import java.util.List;
import java.util.Scanner;

import GLOBALBANKINGMODEL.USERS;
import GLOBALBANKINGREPOSITORY.MYSQLDBConnection;
import GLOBALBANKINGREPOSITORY.USERREPOSITORY;


public class bankingapp {
	Scanner sout = null;
	USERREPOSITORY userrepository=null;
	
	public static void main(String[] args) {
		bankingapp fmcgglobal = new bankingapp();	
		fmcgglobal.DisplayMenu();	
	}
	
	public bankingapp() {
		sout=new Scanner(System.in);
		userrepository = new USERREPOSITORY();
	}
	
	public void DisplayMenu() {
		System.out.println("----------------------------");
		System.out.println("WELCOME TO GLOBALBANKING APP");
		System.out.println("----------------------------\n");
	    Lable : while(true)
	    {
	    	System.out.println("1. DISPLAY USERS DETAILS");
			System.out.println("2. INSERT USER DETAILS");
			System.out.println("0. EXIT");
			Scanner scanner = new Scanner(System.in);
			int result = Integer.parseInt(scanner.nextLine());
			
			switch(result)
			{
			case 1: {
				findAllDetails();
				System.out.println("----------------------------\n");
				break;
			}
			case 2 :{
				SaveProducts();
				System.out.println("\n");
				break;
			}
			case 0 :{
				break  Lable ;
			}
			}
	    }
		System.out.println("-------------Thanks you-------------");

	}
	
	public void findAllDetails() {
			List<USERS> products = userrepository.findAll();
			if (products.size() > 0) {
				products.forEach(System.out::println);
			} else {
				System.out.println("Empty Table");
			}
		}
	   public void SaveProducts() {
		   System.out.print("ENTER THE USER_NAME         : ");
		   String u_name= sout.nextLine();
		   System.out.print("ENTER THE PASSWORD_ENTRY        : ");
		   String p_entry= sout.nextLine();
		   System.out.print("ENTER THE CREATION_DATE               : ");
		   String c_date= sout.nextLine();
		   System.out.print("ENTER THE NUMBER_OF_ACCOUNTS  : ");
		   String n_acc= sout.nextLine();
		   System.out.print("ENTER THE LIST_OF_ACC_NO         : ");
		   String l_acc= sout.nextLine();
		   System.out.print("ENTER THE TOATL BALANCE        : ");
		   String t_bal= sout.nextLine();
		   System.out.print("ENTER THE CONTACT_NO        : ");
		   String c_no= sout.nextLine();
		

		   String insertQuery ="INSERT INTO PRODUCTS VALUES('"+u_name+"','"+p_entry+"','"+c_date
                   +n_acc+"','"+l_acc+"','"+t_bal+"','"
                   +c_no+"');";
		   System.out.println(insertQuery);
		   
		   int result  = MYSQLDBConnection.Insertion(insertQuery);
		   if (result >0)
		   {
			   System.out.println("INSERTED SUCCESSFULLY....");
		   }
		   else
		   {
			   System.out.println("RECORD COULD NOT BE INSERTED....");
		   }
	   }

	private String String(String nextLine) {
		// TODO Auto-generated method stub
		return null;
	}

}