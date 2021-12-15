package com.hcl.wordsplit;

import java.io.*;
import java.util.*;

/*
 * 
 * This File is defines how to write file
 */
public class WordSplit {
	// this method is used to passing string value it is FileName
	public void feilewrit(String Fname) {
		try {

			Scanner input = new Scanner(System.in);
			FileWriter fw = new FileWriter(
					"C:\\Users\\shaiknayabrasool.s\\OneDrive - HCL Technologies Ltd\\Desktop\\wordsplit\\" + Fname
							+ ".txt");

			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println("Enter the String:");
			String s = input.nextLine();// to write data to the file using Scanner class object
			bw.write(s);
			if (bw != null) { // this line defines if File is not empty then it shows Sucessfully
				System.out.println("sucessfully write the file.........");
			}
			bw.close();
			// close BufferWriter
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
