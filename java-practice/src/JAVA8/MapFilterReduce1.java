package JAVA8;

import java.util.Arrays;

public class MapFilterReduce1 {
	public static void main(String[] args) {
//		oldStyleIteration();
//		mapping_operation();
//		filter_operation();
		reduction_operation();
	}

	private static void reduction_operation() {
		// A simple array
		int[] playerSalary = new int[] { 7000, 100, 200 };
		int sum = 0;
		for(int i = 0; i< playerSalary.length; i++) {
			sum = sum + playerSalary[i];
		}
		System.out.println(sum);	
		System.out.println(Arrays.stream(playerSalary).sum());
	}
}
