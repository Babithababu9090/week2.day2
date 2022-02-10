package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		int i;

		Set<Integer> missingnumbers = new TreeSet<Integer>();

		for (i = 0; i < arr.length; i++) {
			missingnumbers.add(arr[i]);
		}

		System.out.println(missingnumbers);

		List<Integer> allnum = new ArrayList<Integer>(missingnumbers);

		for (int j = 1; j <= allnum.size(); j++) {
			if (j != allnum.get(j - 1)) {
				System.out.println(j);
				break;
			}
		}
	}
}
