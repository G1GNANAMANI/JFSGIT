package FMCGGLOBAL;

import java.util.List;
import java.util.Scanner;

import FMCGGLOBALMODEL.Products;
import REPOSITORY.MYSQLDBConnection;
import REPOSITORY.ProductRepository;

public class FMCGGlobalApp {
	Scanner sout = null;
	ProductRepository productrepository=null;
	
	public static void main(String[] args) {
		FMCGGlobalApp fmcgglobal = new FMCGGlobalApp();	
		fmcgglobal.DisplayMenu();	
	}
	
	public FMCGGlobalApp() {
		sout=new Scanner(System.in);
		productrepository = new ProductRepository();
	}
	
	public void DisplayMenu() {
		System.out.println("----------------------------");
		System.out.println("WELCOME TO FMCGGLOBAL APP");
		System.out.println("----------------------------\n");
	    Lable : while(true)
	    {
	    	System.out.println("1. DISPLAY PRODUCTS");
			System.out.println("2. INSERT PRODUCTS");
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
			List<Products> products = productrepository.findAll();
			if (products.size() > 0) {
				products.forEach(System.out::println);
			} else {
				System.out.println("Empty Table");
			}
		}
	   public void SaveProducts() {
		   System.out.print("ENTER THE PRODUCT_ID          : ");
		   String p_id= sout.nextLine();
		   System.out.print("ENTER THE PRODUCT_NAME        : ");
		   String p_Name= sout.nextLine();
		   System.out.print("ENTER THE PRICE               : ");
		   String p_price= sout.nextLine();
		   System.out.print("ENTER THE AVAILABLE_QUANTITY  : ");
		   String p_quantity= sout.nextLine();
		   System.out.print("ENTER THE EXPIRY_DATE         : ");
		   String p_ExpiryDate= sout.nextLine();
		   System.out.print("ENTER THE SUPPLIER_ID         : ");
		   String p_sid= sout.nextLine();
		   System.out.print("ENTER THE CUSTOMER_ID         : ");
		   String p_cid= sout.nextLine();
		   System.out.print("ENTER THE REORDER_LEVEL       : ");
		   String p_Level= sout.nextLine();
		   System.out.print("ENTER THE REMARKS             : ");
		   String p_remarks= sout.nextLine();

		   String insertQuery ="INSERT INTO PRODUCTS VALUES('"+p_id+"','"+p_Name+"','"+p_price+"','"
		                                                      +p_quantity+"','"+p_ExpiryDate+"','"+p_sid+"','"
				                                              +p_cid+"','"+p_Level+"','"+p_remarks+"');";
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