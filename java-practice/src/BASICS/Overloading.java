package BASICS;
import java .util.Scanner;
public class Overloading {
	public static void main (String[] args)
	{
		try (Scanner scannerObject = new Scanner(System.in)) {
			System.out.println("Enter the number 1");
			String number1string = scannerObject.nextLine();
			System.out.println("Enter the number 2");
			String number2string = scannerObject.nextLine();
			Double number1= Double.parseDouble(number1string);
			Double number2= Double.parseDouble(number2string);
			
			Overloading mod = new Overloading();
			mod.adddouble(number1, number2);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void adddouble(double a, double b)
	{
		double result=a=b;
		System.out.println(result);
	}
}