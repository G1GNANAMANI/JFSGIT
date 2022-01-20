package BASICS;
import java.util.Scanner;

public class FruitSwitch {

public static void main(String[] args) {
	try (Scanner scannerObject = new Scanner(System.in)) {
		System.out.println("ENTER THE FRUIT OR COLOR:");
		String input = scannerObject.nextLine();
		switch (input)
		{
		case "RED":
		System.out.println(" IT IS COLOR");
		break;
		case "GREEN":
		System.out.println(" IT IS COLOR");
		break;
		case "YELLOW":
		System.out.println(" IT IS COLOR");
		break;
		case  "APPLE":
		System.out.println(" IT IS FRUIT");
		break;
		case "ORANGE":
		System.out.println(" IT IS FRUIT");
		break;
		case "BERRY":
		System.out.println(" IT IS FRUIT");
		break;
		}
	}
}
}