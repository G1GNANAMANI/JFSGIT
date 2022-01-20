package BASICS;
import java.util.Scanner;

public class Fruit {
public static void main(String[] args) {
	try (Scanner scannerObject = new Scanner(System.in)) {
		System.out.println("Enter object:");
		String input = scannerObject.nextLine();
		
		if(input.equals("RED")) {
			System.out.println(" IT IS COLOR");
		}
		else if(input.equals("GREEN")) {
			System.out.println("IT IS COLOR");
		}
		else if(input.equals("YELLOW")) {
			System.out.println("IT IS COLOR");
		}
		else if(input.equals("APPLE")) {
			System.out.println("IT IS FRUIT ");
		}
		else  if(input.equals("BANNANA")) {
		    System.out.println("IT IS FRUIT");
		}  
		else if(input.equals("BERRY")) {
		   System.out.println("IT IS FRUIT");
		}
		else
		{
			System.out.println("NOT AN OBJECT");
		}
	}
}
}