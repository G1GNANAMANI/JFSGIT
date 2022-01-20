package JAVA8;

import java.util.ArrayList;

public class Wrapper {
	public static void main(String[] args) {
		String idstring ="12345";
		int idInt = Integer.parseInt(idstring);
		int result = idInt + idInt;
		System.out.println(result);
		int i = 100;
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		Integer integerVal = i;
		numberList.add(integerVal);
		Integer.valueOf(i);
	}
}