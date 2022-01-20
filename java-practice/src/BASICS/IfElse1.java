package BASICS;
import java.util.Scanner;

public class IfElse1 {
public static void main(String[] args) {
	try (Scanner scannerObject = new Scanner(System.in)) {
		System.out.println("Enter alphabet :");
		String input = scannerObject.nextLine();
		if(input.equals("A")) {
			System.out.println("The input is a vowel" + input);
		}
		else if(input.equals("E")) {
			System.out.println("The input is a vowel" + input);
		}
		else if(input.equals("I")) {
			System.out.println("The input is a vowel" + input);
		}
		else  if(input.equals("O")) {
		    System.out.println("The input is a vowel" + input);
		}  
		else if(input.equals("U")) {
		   System.out.println("The input is a vowel" + input);
		}
		else
		{
			System.out.println("Not a vowel");
		}
	}
}
}