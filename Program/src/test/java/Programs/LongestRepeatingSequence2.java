package Programs;

import java.util.ArrayList;

//Java Program to find the longest repeating sequence in a string

public class LongestRepeatingSequence2 {

	public static void main(String[] args) {
		int Right = 0;
		int Left = 0;
		int Max = 0;
		String str = "acbdfghybdf";
		ArrayList<Character> a1 = new ArrayList<Character>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			a1.add(ch);

		}

		for (int i = 0; i < a1.size(); i++) {
			char ch1 = str.charAt(i);
			for (int j = i + 1; j < a1.size(); j++) {
				char ch2 = str.charAt(j);
				if (ch1 == ch2) {
					System.out.print(ch1);
				}
			}
		}

	}

}
