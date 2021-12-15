package com.hcl.lettercombination;

/*
 * 
 * This file is defines divide the alphabets possible ways and it can return all possible ways
 * 
 */

import java.util.*;

class LetterCombination {
	int j = 0;

	public List<String> letterCombinations(String digits) {
		// this method defines passing string values and returns list
		if (digits.length() == 0)// it can can check if string length 0 it can return empty array list
			return new ArrayList<>();

		String[] dict = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		// it defines all possible string are stored in index positions
		List<String> combos = new ArrayList<>();
		// it can empty array list pass all combinations
		combinations(combos, digits.toCharArray(), "", dict);
		// it can call method combinations() and pass the values
		for (String ss : combos) {
			// this loop counts all possible ways and store value to j
			j++;
		}
		System.out.println("TOTAL POSSIBLE WAYS :" + j); // count the combos
		System.out.print("I WILL SHOW U WHAT IS IT:  ");
		return combos; // it return all possible combinations to list
	}

	public void combinations(List<String> combos, char[] digits, String s, String[] dict) {

		// this method we can pass empty list,char[] array and one empty string and pass
		// alphabets string array
		if (s.length() == digits.length) {
			/*
			 * it check length of 's' string and length of String[] dict it quels then it
			 * can add combo list array and returns otherwise it goto check for Each loop
			 */

			combos.add(s);
			return;
		}
		int i = s.length();// 's' is empty string so it can store default value 0
		int digit = digits[i] - '0';
		/*
		 * it means 0 convert decimal value 48 and digits[i] means position of digits is
		 * we define digit it can convert decimal value
		 * 
		 */
		for (char letter : dict[digit].toCharArray()) {
			// this for defines dicit string array can convert in character

			combinations(combos, digits, s + Character.toString(letter), dict);
			// this recursion call process until for each loop end

		}

	}

}
