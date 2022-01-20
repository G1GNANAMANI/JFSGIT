package ECOM;
import java.util.ArrayList;
import java.util.Scanner;
public class App1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Ecommerce World");
        System.out.println("/n****************Adding books to the cart **************");
        ArrayList<String> shoppingCart = new ArrayList<String>();
        try (Scanner sc = new Scanner(System.in)) {
			String book1 = sc.nextLine();
			String book2 = sc.nextLine();
			String book3 = sc.nextLine();
			shoppingCart.add(book1);
			shoppingCart.add(book2);
			shoppingCart.add(book3);
			System.out.println("/n***************Displaying the books**********");
			for (String book : shoppingCart) {
			    System.out.println(book);
			}
			System.out.println("/n***************Searching a book*****************");
			String searchbook = sc.nextLine();
			boolean foundbook = false;
			for (String book : shoppingCart) {
			    if (searchbook.equalsIgnoreCase(book)) {
			        foundbook = true;
			    }
			}
			if (foundbook) {

if (foundbook) {
			    System.out.println("found the book");
			} else {
			    System.out.println("book not found so it will be added");
			    shoppingCart.add(searchbook);
			}
			System.out.println("/n***************UPDATED BOOK LIST**********");
			for (String book : shoppingCart) {
			    System.out.println(book);
			}
			System.out.println("********************Removing updated books************");
			String removebook = sc.nextLine();

			System.out.println("***************Updated booklist after removing********** ");
			boolean removed = shoppingCart.remove(removebook);
			if(removed) {
			    System.out.println("Removed book : " + removebook);
			}
			else {
			    System.out.println("It is not in the book list");
			}
			
			}
		}
    }
}