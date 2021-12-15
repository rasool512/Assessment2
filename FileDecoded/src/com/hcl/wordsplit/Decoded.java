package com.hcl.wordsplit;
/*
 * This file shows how read file and show how to  decode  File Data
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.FileReader;

public class Decoded {

	public void FileReader(String Fname) {
		// this refers passing string variable it is nothing but file name
		try {
			/*
			 * this FilleReader object check if file is Available are not if it is available
			 * simple refers the file in case it is not available then it can create new
			 * File
			 * 
			 */
			FileReader fr = new FileReader(
					"C:\\\\Users\\\\shaiknayabrasool.s\\\\OneDrive - HCL Technologies Ltd\\\\Desktop\\\\wordsplit\\\\"
							+ Fname + ".txt");
			BufferedReader br = new BufferedReader(fr);
			// this object reads file line by line from the File Fname
			String s = br.readLine(); // this method used to read file
			String ch = " ";
			String rep = s.replace(' ', '*'); // this line find white spaces and add '*' to the String s
			String[] arr = rep.split("\\s"); // this line defines split the string and store string array
			System.out.println("************Text is decoded****************");
			for (String w : arr) {
				// this line defines count word by word
				char[] c = w.toCharArray(); // this line words can convert Character by Character

				for (int i = c.length - 1; i >= 0; i--) {

					ch += c[i]; // store the character to string

				}

			}

			String line = ch;
			while (line != null) {
				// this line check string is not empty then it print
				System.out.println(line);

				line = br.readLine();
			}
			br.close(); // close the BufferReader then automatically close FileReader also

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
