package week3.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		int number[] = { 3, 2, 11, 4, 6, 7 };
		int number2[] = { 1, 2, 8, 4, 9, 7 };
		System.out.println("interscetion");
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number2.length; j++)

			{

				if (number[i] == number2[j]) {

					System.out.println(number2[i]);

				}

			}
		}
	}
}
