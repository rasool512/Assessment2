package com.hcl.operations;

import java.io.*;
import java.util.*;

public class CreateFile {

	public void createfile(String s) { // this line defines passing string name it is file name also

		try {

			File myobj = new File(
					"C:\\Users\\shaiknayabrasool.s\\OneDrive - HCL Technologies Ltd\\Desktop\\FileIO\\" + s + ".txt");

			if (myobj.createNewFile()) {
				// this method defines it can check if the file is already available it returns
				// false otherwise it create new file
				System.out.println("File created:" + myobj.getName());
			} else {
				System.out.println("File alredy exist");

			}
		}

		catch (IOException e) {
			System.out.println("An error occurred:");
			e.printStackTrace();
		}
	}
}
