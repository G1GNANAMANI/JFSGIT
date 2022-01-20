package THREADS;


import java.util.Scanner;
import java.util.ArrayList;

public class ProuductThread {
	public static void main(String[] args) {
		
		PRODUCT_MODEL_LIST pm = new PRODUCT_MODEL_LIST();
		//pn.start();
		pm.start();
		//pn.Display_Name();
		try {
			pm.join();
		} catch (InterruptedException e) {
			System.out.println("Thread Interrupted");
		}
		pm.Didplay();
			
	}
	
}
class PRODUCT_NAME
{
	String  Product_Name;
	
	PRODUCT_NAME(String s1)
	{
		 Product_Name = s1;
	}
	
	public void DISPLAY_NAM()
	{
		System.out.println("THE PRODUCT_NAME is "+ Product_Name);
	}
}
class PRODUCT_MODEL
{
	String  Product_model;
	 PRODUCT_MODEL(String S2) {
		 Product_model= S2;
	}
	public void DISPLAY_MOD()
	{
		System.out.println("The Product Model is "+ Product_model);
	}
}
class PRODUCT_NAME_LIST extends Thread
{
	
    ArrayList<PRODUCT_NAME> pon = new  ArrayList<PRODUCT_NAME>();
//  
    Scanner can = new Scanner(System.in);
    public void run() {
    	
    	System.out.print("Enter the Product Name : ");
    	String n1 = can.nextLine();
    	System.out.print("Enter the Product Name : ");
    	String n2 = can.nextLine();
    	System.out.print("Enter the Product Name : ");
    	String n3 = can.nextLine();
    	System.out.print("Enter the Product Name : ");
    	String n4 = can.nextLine();
    	
    	  PRODUCT_NAME P_N = new PRODUCT_NAME(n1);
    	  PRODUCT_NAME P_N1 = new PRODUCT_NAME(n2);
    	  PRODUCT_NAME P_N2 = new PRODUCT_NAME(n3);
    	  PRODUCT_NAME P_N3 = new PRODUCT_NAME(n4);
    	  pon.add(P_N);
    	  pon.add(P_N1);
    	  pon.add(P_N2);
    	  pon.add(P_N3);
    }
    public void Display_Name() {
    	for(PRODUCT_NAME IT: pon)
    	{
    		System.out.println(" The Product Name is : "+IT.Product_Name);
    	}
    }
    
}
    class PRODUCT_MODEL_LIST extends Thread
    {
    	
        ArrayList<PRODUCT_MODEL> pond = new  ArrayList<PRODUCT_MODEL>();
    //  
        Scanner can = new Scanner(System.in);
        public void run() {
        	try {
        		
        	Thread.sleep(10000);
        	System.out.print("Enter the Product Model : ");
        	String n1 = can.nextLine();
        	System.out.print("Enter the Product Model : ");
        	String n2 = can.nextLine();
        	System.out.print("Enter the Product Model : ");
        	String n3 = can.nextLine();
        	System.out.print("Enterthe Product Model : ");
        	String n4 = can.nextLine();
        	
        	 PRODUCT_MODEL P_ND =  new PRODUCT_MODEL(n1);
        	 PRODUCT_MODEL P_ND1 = new PRODUCT_MODEL(n2);
        	 PRODUCT_MODEL P_ND2 = new PRODUCT_MODEL(n3);
        	 PRODUCT_MODEL P_ND3 = new PRODUCT_MODEL(n4);
        	  pond.add(P_ND);
        	  pond.add(P_ND1);
        	  pond.add(P_ND2);
        	  pond.add(P_ND3);
        	  
        	}
        	catch(InterruptedException e)
        	{
        	e. printStackTrace();
        	}
        	
        	  
        }
    
        public void Didplay() {
        	for(PRODUCT_MODEL IT: pond)
        	{
        		System.out.println(" The Product Model is : "+ IT.Product_model);
        	}
        }
}

    















