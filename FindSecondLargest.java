package week3.day2.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		Arrays.sort(data);
		int size = data.length;
		for (int i = 0; i < data.length; i++) {
			System.out.println("Sorted array :" + data[i]);
			// System.out.println(data[size - 2]);
		}
		System.out.println("Second largest No:" + data[size - 2]);
	}

}
