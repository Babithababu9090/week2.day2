package week3.day2.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if ((arr[i]) == (arr[j])) {
					System.out.println("Duplicate elements");
					System.out.println(arr[i]);
				}
			}
		}

	}

}
