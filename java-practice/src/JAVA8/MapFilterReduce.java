package JAVA8;
import java.util.ArrayList;
import java.util.Iterator;
public class MapFilterReduce { 
	public static void main(String[] args) {
		oldStyleIteration();
		
	}
	private static void oldStyleIteration() {
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(6);
		integerList.add(10);
		
		for (int i = 0; i < integerList.size(); i++) {
			Integer number = integerList.get(i);
			System.out.println(number);
		}
		System.out.println("using enhanced loop");
		for(Integer number1 : integerList)
		{
		System.out.println(number1);
	}
	System.out.println("using iterator");
	Iterator<Integer> iterator = integerList.iterator();
	while(iterator.hasNext())
	{
		Integer number3 = iterator.next();
		System.out.println(number3);
	}
}
}
