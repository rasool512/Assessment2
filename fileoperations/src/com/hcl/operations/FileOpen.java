package com.hcl.operations;

import java.io.*;

public class FileOpen {

	public void openfile(String s) {
		try {
			// constructor of File class having file as argument
			File file = new File(
					"C:\\\\\\\\Users\\\\\\\\shaiknayabrasool.s\\\\\\\\OneDrive - HCL Technologies Ltd\\\\\\\\Desktop\\\\\\\\FileIO\\\\\\\\"
							+ s + ".txt");
			// creates a buffer reader input stream
			BufferedReader br = new BufferedReader(new FileReader(file));
			System.out.println("The file content is: ");
			int r = 0;
			while ((r = br.read()) != -1) {
				// this line defines if the file is empty are not to be check file is not empty
				// then it read the file
				System.out.print((char) r);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
