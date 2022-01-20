package EXCEPTION;
import java.util.Scanner;

public class HandledException1 {
      public static void main(String[] args) {
    	  try (Scanner scannerObject = new Scanner(System.in)) {
			System.out.println("Enter the number 1");
			String number1string = scannerObject.nextLine();
			System.out.println("Enter the number 2");
			String number2string = scannerObject.nextLine();
			try {
			int number1 = Integer.parseInt(number1string);
			int result = number1;
			System.out.println("Result :" + result);
			}
			catch (NumberFormatException numberFormatExceptionObject) {
				System.out.println("Enter valid numbers");
			}
			try {
				
			int number2 = Integer.parseInt(number2string);
			int result1 = number2; 
			System.out.println("Result1 : "+ result1);
			
			}
			catch (NumberFormatException numberFormatExceptionObject1) {
				System.out.println("Enter valid numbers");
			}
		}
  		}
      }
      
