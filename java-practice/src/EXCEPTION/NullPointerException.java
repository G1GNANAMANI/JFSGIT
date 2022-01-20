package EXCEPTION;

import java.util.Scanner;

public class NullPointerException {
	public static void main(String[] args) {
		calculator calculatorObject = null;
		calculatorObject = new calculator();
		System.out.println("ADD");
		try {
			calculatorObject.add();
		} catch (Exception e ) {
			System.out.println("THE OBJECT IS NOT INSTANTIATED........");
		}
	}
}
		
	class calculator {

		public void add() {
			try (Scanner scannerObject = new Scanner(System.in)) {
				System.out.println("enter num1:");
				String num1String = scannerObject.nextLine();
				System.out.println("enter num2:");
				String num2string = scannerObject.nextLine();
				int num1 = Integer.parseInt(num1String);
				int num2 = Integer.parseInt(num2string);
				int result = num1 + num2;
				System.out.println("Result is:" + result);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
}