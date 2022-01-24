package FMCGGLOBAL;

import java.util.List;
import java.util.Scanner;

import FMCGGLOBALMODEL.Products;
import REPOSITORY.ProductRepository;

public class FMCGGlobalApp {
	Scanner scanner = null;
	ProductRepository productRepository = null;


	public static void main(String[] args) {
		FMCGGlobalApp FMCGGLOBALAPP = new FMCGGlobalApp();
		FMCGGLOBALAPP.displayMenu();
	}

	public FMCGGlobalApp() {
		scanner = new Scanner(System.in);
		productRepository = new REPOSITORY.ProductRepository();
	}

	private void displayMenu() {
		System.out.println("WELCOME TO FMCGGLOBAL");
		System.out.println("===================");
		while_label: while (true) {
			System.out.println("\n1. DISPLAY PRODUCTS");
			System.out.println("2. ADD PRODUCT");
			System.out.println("0. EXIT");
			System.out.print("ENTER CHOICE : ");
			int choice = Integer.parseInt(scanner.nextLine());
			System.out.println();

			switch (choice) {
			case 1: {
				findAllProducts();
				break;
			}
			case 2: {
				saveProduct();
				break;
			}
			case 0: {
				break while_label;
			}

			default: {
				System.out.println("Enter a valid option");
			}
			}
		}
		System.out.println("THANK YOU !!!");
		System.out.println("===================");
	}

	private void findAllProducts() {
		List<Products> productsList = REPOSITORY.ProductRepository.findAll();
		if (productsList.size() > 0) {
			productsList.forEach(System.out::println);
		} else {
			System.out.println("NO PRODUCTS");
		}
	}

	private void saveProduct() {
//		ACCEPT PRODUCT DETAILS FROM USER
		Products product = new Products("P006","PICKLE",120,5,"2027-05-03","SOO6","C001",9,"NO");
		REPOSITORY.ProductRepository.save(product);
	}
}