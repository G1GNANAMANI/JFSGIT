package EXCEPTION;
import java.util.Scanner;
public class Finally {
	public static void main(String[] args) {
		try (Scanner scannerObject = new Scanner(System.in)) {
			System.out.println("Enter the number 1");
			String number1string = scannerObject.nextLine();
			System.out.println("Enter the number 2");
			String number2string = scannerObject.nextLine();
			try {
			int number1 = Integer.parseInt(number1string);
			int number2 = Integer.parseInt(number2string);
			int result = number1 + number2;
			System.out.println("Result is: " + result);
			}
			catch (NumberFormatException numberFormatExceptionObject) {
				System.out.println(" Invalid numbers entered......");
			} finally {
			System.out.println("SWITCH OF...");
}
		}
  }
}


