package String;

import java.util.*;

public class RemoveDulpicateChar {
	public static void isRemove(String str) {
		char[] ch = str.toCharArray();

		HashSet<Character> hs = new HashSet<>();
		for (char ch2 : ch) {
			hs.add(ch2);
		}

		char empty[] = new char[hs.size()];
		char k = 0;

		for (char charac : hs) {
			empty[k++] = charac;
		}
		System.out.println(String.valueOf(empty));

	}

	public static void main(String[] args) {
		String str = "aabbccddeeffgg";
		isRemove(str);

	}

}
