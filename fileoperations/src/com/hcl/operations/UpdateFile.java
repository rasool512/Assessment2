package com.hcl.operations;
import java.io.*;
import java.util.*;
public class UpdateFile {
	
/*
 * This file is defines how to update the data
 * 	
 */
	
	Scanner sc=new Scanner(System.in);
	
	public void updateConfig(String s) {
			try {

				// Get the name of the key to be updated
				System.out.println("Enter the key ");
				String Key = sc.next();
				// Get the value to be updated
				System.out.println("Enter the value to be updated");
				String value = sc.next();
				String KeyValueString, name;
				int index;
				// Using file pointer creating the file.
				File file = new File("C:\\\\Users\\\\shaiknayabrasool.s\\\\OneDrive - HCL Technologies Ltd\\\\Desktop\\\\FileIO\\\\"+s+".txt");
				if (!file.exists()) {
					// Create a new file if not exists.
					file.createNewFile();
				}
				// Opening file in reading and write mode.
				RandomAccessFile raf = new RandomAccessFile(file, "rw");
				boolean found = false;
				// Checking whether the key already exists.
				// getFilePointer() give the current offset value from start of the file.
				while (raf.getFilePointer() < raf.length()) {
					// reading line from the file.
					KeyValueString = raf.readLine();
					if (KeyValueString.contains(Key)) {
						found = true;
						break;
					}
				}

				// Update the value if record exists.
				if (found == true) {
					// Creating a temporary file with file pointer as tmpFile.
					File tmpFile = new File("temp.ini");
					// Opening this temporary file in ReadWrite Mode
					RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");
					// Set file pointer to start
					raf.seek(0);
					// Traversing the notes.ini file
					while (raf.getFilePointer() < raf.length()) {
						// Reading from the file
						KeyValueString = raf.readLine();
						index = KeyValueString.indexOf('=');
						name = KeyValueString.substring(0, index);
						// Check if the fetched key is the one to be updated
						if (name.equals(Key)) {
							// Update the value
							KeyValueString = name + "=" + value;
						}

						// Add this field in the temporary file
						tmpraf.writeBytes(KeyValueString);
						// Add the line separator in the temporary file
						tmpraf.writeBytes(System.lineSeparator());
					}

					// Since the value has been updated copy the updated content from the temporary
					// file to original file.
					// Set both files pointers to start
					raf.seek(0);
					tmpraf.seek(0);
					// Copy the contents from the temporary file to original file.
					while (tmpraf.getFilePointer() < tmpraf.length()) {
						raf.writeBytes(tmpraf.readLine());
						raf.writeBytes(System.lineSeparator());
					}

					// Set the length of the original file to that of temporary.
					raf.setLength(tmpraf.length());
					// Closing the resources.
					tmpraf.close();
					raf.close();
					// Deleting the temporary file
					tmpFile.delete();
					System.out.println(" File updated ");
				}
				// The key to be updated could not be found
				else {
					// Closing the resources.
					raf.close();
					System.out.println(" Key does not exists ");
				}
			}

			catch (Exception e) {
				System.out.println(e);
			}

		}
}
