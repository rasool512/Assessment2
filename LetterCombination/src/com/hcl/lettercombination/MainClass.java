package com.hcl.lettercombination;

import java.util.*;

/*
 * this file is defines print all combinations and call method 
 */
class MainClass {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		LetterCombination l = new LetterCombination();
		// create object to LetterCombination class
		System.out.println("**********please Enter numbers only**********");
		String s = sc.nextLine();

		System.out.println(l.letterCombinations(s));

		// calling method letterCombination and pass string value

	}

}
