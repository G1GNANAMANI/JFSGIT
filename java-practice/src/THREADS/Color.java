package THREADS;
import java.util.ArrayList;
import java.util.Scanner;
public class Color
{
	public static void main(String[] args) {

		ListThread listThread = new ListThread();
		listThread.start();
		
		ProductName productThread = new ProductName(null);
		productThread.start();
	}

}
class List
{

	String Ccolor;

	public List(String Ccolor) {
		this.Ccolor = Ccolor;
	}

	public void display() {
		System.out.println(Ccolor);

	}
}

class ProductName {
	String Pname;

	ProductName(String Pname) {
		this.Pname = Pname;
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

	public void display() {
		System.out.println(Pname);

	}

}

class ListThread extends Thread {
	public void run() {
		try (Scanner s = new Scanner(System.in)) {
			ArrayList<List> colname = new ArrayList<List>();
			System.out.println("ENTER THE NAME OF THE COLOR");
			String c1 = s.nextLine();
			String c2 = s.nextLine();
			String c3 = s.nextLine();
			String c4 = s.nextLine();
			String c5 = s.nextLine();
			List c11 = new List(c1);
			List c12 = new List(c2);
			List c13 = new List(c3);
			List c14 = new List(c4);
			List c15 = new List(c5);
			colname.add(c11);
			colname.add(c12);
			colname.add(c13);
			colname.add(c14);
			colname.add(c15);
			for (List lt : colname) 
			{
				lt.display();
			}
		}
	}
}