package String;

public class ReverseString {
	public static void isReverse(String str1, String str2) {
		for (int i = str1.length() - 1; i >= 0; i--) {
			str2 = str2 + str1.charAt(i);
		}
		System.out.println("Reverse String by for loop :" + " " + str2);
		// System.out.println();
	}

	public static void revrsebyWhil(String str1, String str2) {
		int i = str1.length();
		while (i > 0) {
			str2 = str2 + str1.charAt(i - 1);
			i--;
		}
		System.out.println("Reverse String by while loop :" + " " + str2);

	}

	public static void main(String[] args) {
		String str1 = "Reverse String";
		String str2 = "";
		isReverse(str1, str2);
		revrsebyWhil(str1, str2);
	}

}
