package String;

import java.util.HashMap;

public class CountCharOfStringByHashmap {

	public static void isRep(String str) {
		HashMap<Character, Integer> hm = new HashMap<>();
		// System.out.println(hm);
		// hm.containsKey(c);

		char[] ch = str.toCharArray();

		for (char c : ch) {
			if (hm.containsKey(c)) {

				hm.put(c, hm.get(c) + 1);

			} else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
	}

	public static void main(String[] args) {
		String str = "eeeeeddddcccbba";
		isRep(str);

	}

}
