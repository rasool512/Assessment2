package com.hcl.mainlaunch;

import com.hcl.wordsplit.*; //this line defines import out side of package all class
/*
 * this file defines how call methods 
 * and shows menu options 
 * and read File name also
 */
import java.util.*;

class MainLaunch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******This application show how decoded file");
		System.out.println("1.FileWriter");
		System.out.println("2.FileReader");
		System.out.println("3.Exist");

		WordSplit w = new WordSplit(); // creating object to outside of the class WordSplit
		Decoded d = new Decoded();// creating object to outside of the class Decoded
		System.out.println("Please Enter File name:");
		String Fname = sc.nextLine();
		System.out.println("file is created.........");
		System.out.println("***********Choose Menu Options*********");
		boolean quit = false;
		do {
			int n = sc.nextInt();
			switch (n) {

			case 1:
				// choose case 1 we write the file
				w.feilewrit(Fname);
				break;
			case 2:
				// choose case 2 we can read file and decoded also
				d.FileReader(Fname);
				break;
			case 3:
				// we choose option 3 file successfully exist
				quit = true;
				System.out.println("SUCESSFULLY QUITED APPLICATION ");
				break;
			}
		} while (!quit);
	}

}
