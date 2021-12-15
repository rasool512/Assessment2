package com.hcl.operations;

import java.io.*;

/*
 * this file defines how pass data to the file and how can save data to file
 * and we pass  multiple users data to the file
 */
import java.util.*;
import java.io.*;

public class AddConfig {
	Scanner sc = new Scanner(System.in);
	public String cPrg, cDir, iKit, iInstall, iPNo, iStatusWindow, cService, cRecovery, iTimezone, iDst, iDstlaw,
			cFiledir;

	/**
	 * This method adds the user input details to the file. It also checks for the
	 * file existence. If not present creates a new file at specified position.
	 * 
	 * @return null
	 * @throws IOException
	 */

	public void addConfig(String b) { // this line defines passing string name it is file name also
		try {
			char moreRecords, ch;
			// Creating a file object at specific location
			File file = new File(
					"C:\\\\Users\\\\shaiknayabrasool.s\\\\OneDrive - HCL Technologies Ltd\\\\Desktop\\\\FileIO\\\\" + b
							+ ".txt");
			// Checking for file existence
			if (!file.exists()) {

				System.out.println("file Created");
			}

			do {

				System.out.println("NotesProgram= ");
				cPrg = sc.next();
				System.out.println("Directory= ");
				cDir = sc.next();
				System.out.println("KitType= ");
				iKit = sc.next();
				System.out.println("InstallType= ");
				iInstall = sc.next();
				System.out.println("PartitionNumber= ");
				iPNo = sc.next();
				System.out.print("ShowControllerStatusWindow= ");
				iStatusWindow = sc.next();
				System.out.println("ServiceName= ");
				cService = sc.next();
				System.out.println("FaultRecovery_Build= ");
				cRecovery = sc.next();
				System.out.print("Timezone= ");
				iTimezone = sc.next();
				System.out.println("DST= ");
				iDst = sc.next();
				System.out.println("DSTLAW= ");
				iDstlaw = sc.next();
				System.out.println("FileDlgDirectory= ");
				cFiledir = sc.next();
				// Asking for change in data entered
				System.out.println("Enter 'y' to save above information");
				ch = sc.next().toLowerCase().charAt(0);
				if (ch == 'y') {
					// Creating the file writer object to write the data to file
					FileWriter fw = new FileWriter(file, true);
					// Creating the print writer object to write the data from console to file
					PrintWriter out = new PrintWriter(fw);
					out.println("NotesProgram=" + cPrg);
					out.println("Directory= " + cDir);
					out.println("KitType=" + iKit);
					out.println("InstallType=" + iInstall);
					out.println("PartitionNumber=" + iPNo);
					out.println("showControllerStatusWindow=" + iStatusWindow);
					out.println("ServiceName=" + cService);
					out.println("FaultRecovery_Build=" + cRecovery);
					out.println("Timezone=" + iTimezone);
					out.println("DST=" + iDst);
					out.println("DSTLAW=" + iDstlaw);
					out.println("FileDlgDirectory=" + cFiledir);
					out.close();
					System.out.println("Information added");
				} else {
					addConfig("welcome");
				}
// Asking for more records
				System.out.print("Do you want to add more records? (Y/N)");
				moreRecords = sc.next().toLowerCase().charAt(0);
			} while (moreRecords == 'y');
		}

		catch (Exception e) {

			e.printStackTrace();

		}
	}
}
