package ECOM;

import java.util.ArrayList;

public class App {
	public static void main(String[] argrs) {
		System.out.println("Welcome to the FAIRY WORLD ");
		System.out.println("\n*******ADDING BOOKS TO CART******");
		ArrayList<String> shoppingCart =  new ArrayList<String>();
		shoppingCart.add("BARBIE");
		shoppingCart.add("RAPENZULE");
		shoppingCart.add("SNOW WHITE");
		System.out.println("\n******DISPLAYING ALL THE BOOKS******");
		for (String book : shoppingCart) {
			System.out.println(book);
		}

		System.out.println("\n******SEARCHING FOR A BOOK******");
		String Searchbook = "RAPENZULE";
		boolean bookFound =  false;
		for (String  book : shoppingCart) {
			if (Searchbook.equalsIgnoreCase(book)) {
				bookFound =  true;
				
			}
		}
		if (bookFound) {
			System.out.println("FOUND THE BOOK");
		} else {
			System.out .println("BOOK NOT FOUND");
		}
	}
	}