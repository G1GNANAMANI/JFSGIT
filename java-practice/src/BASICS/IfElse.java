package BASICS;
import java.util.Scanner;

public class IfElse {
public static void main(String[] args) {
	try (Scanner scannerObject = new Scanner(System.in)) {
		System.out.println("Enter alphabet :");
		String input = scannerObject.nextLine();
		if(input.equals("a")) {
			System.out.println("The input is a vowel" + input);
		}
		else if(input.equals("e")) {
			System.out.println("The input is a vowel" + input);
		}
		else if(input.equals("i")) {
			System.out.println("The input is a vowel" + input);
		}
		else  if(input.equals("o")) {
		    System.out.println("The input is a vowel" + input);
		}  
		else if(input.equals("u")) {
		   System.out.println("The input is a vowel" + input);
		}
		else
		{
			System.out.println("Not a vowel");
		}
	}
}
}