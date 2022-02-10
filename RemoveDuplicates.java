package week3.day2.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		String s2 = "";
		for (int i = 0; i < text.length(); i++) {
			Boolean found = false;
			for (int j = 0; j < s2.length(); j++) {
				if (text.charAt(i) == s2.charAt(j)) {
					found = true;
					break; // don't need to iterate further
				}
			}
			if (found == false) {
				s2 = s2.concat(String.valueOf(text.charAt(i)));
			}
		}
		System.out.println(s2);
	}
}
