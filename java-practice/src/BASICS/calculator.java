package BASICS;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		calculator calculatorObject = new calculator();
		System.out.println("ADD");
		calculatorObject.add();
		System.out.println("MULTIPLY");
		calculatorObject.multiply();
		System.out.println("SUBTRACT");
		calculatorObject.subtract();
	    System.out.println("DIVIDE");
	    calculatorObject.divide();
	}
	public void add() {
		try (Scanner scannerObject = new Scanner(System.in)) {
			System.out.println("enter num1:");
			String num1String=scannerObject.nextLine();
			System.out.println("enter num2:");
			String num2string=scannerObject.nextLine();
			int num1=Integer.parseInt(num1String);
			int num2=Integer.parseInt(num2string);
			int result=num1+num2;
			System.out.println("Result is:"+result);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	public void multiply() {
		try (Scanner scannerObject = new Scanner(System.in)) {
			System.out.println("enter num1:");
			String num1String=scannerObject.nextLine();
			System.out.println("enter num2:");
			String num2string=scannerObject.nextLine();
			int num1=Integer.parseInt(num1String);
			int num2=Integer.parseInt(num2string);
			int result=num1*num2;
			System.out.println("Result is:"+result);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void subtract(){
		try (Scanner scannerObject = new Scanner(System.in)) {
			System.out.println("enter num1:");
			String num1String=scannerObject.nextLine();
			System.out.println("enter num2:");
			String num2string=scannerObject.nextLine();
			int num1=Integer.parseInt(num1String);
			int num2=Integer.parseInt(num2string);
			int result=num1-num2;
			System.out.println("Result is:"+result);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void divide() {
		try (Scanner scannerObject = new Scanner(System.in)) {
			System.out.println("enter num1:");
			String num1String=scannerObject.nextLine();
			System.out.println("enter num2:");
			String num2string=scannerObject.nextLine();
			int num1=Integer.parseInt(num1String);
			int num2=Integer.parseInt(num2string);
			int result=num1/num2;
			System.out.println("Result is:"+result);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}