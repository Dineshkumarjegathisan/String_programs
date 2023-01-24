package String;

public class program1 {
	public static void toCount(String str) {
		int upper = 0, lower = 0, digit = 0, splchar = 0;
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upper++;
			} else if (ch >= 'a' && ch <= 'z') {
				lower++;
			} else if (ch >= '0' && ch <= '9') {
				digit++;
			} else {
				splchar++;
			}
		}

		System.out.println("upper :" + upper);
		System.out.println("lower :" + lower);
		System.out.println("digit :" + digit);
		System.out.println("splchar :" + splchar);

	}

	public static void main(String[] args) {
		String str = "dD$0";
		toCount(str);
	}

}
