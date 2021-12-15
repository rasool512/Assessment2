package com.hcl.launchprogram;
import com.hcl.operations.*;

import java.util.*;

class MainFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("**********This Application Perform CRUD Operations*********");
		System.out.println("1.CreateFile");
		System.out.println("2.EnterDetails");
		System.out.println("3.UpdateFile");
		System.out.println("4.DisplayFile");
		System.out.println("5.DeleteFile");
		System.out.println("6.exist");
		System.out.println("**********ChooseMenu Options***********");
		System.out.println("Please Enter File Name:");
		String s = sc.nextLine();
		CreateFile c = new CreateFile();
		// create the object out side of package class CreateFile
		AddConfig a = new AddConfig();
		// create the object out side of package class AddConfig
		FileOpen o = new FileOpen();
		// create the object out side of package class FileOpen
		DeleteFile d = new DeleteFile();
		// create the object out side of package class DeleteFile
		UpdateFile u = new UpdateFile();
		// create the object out side of package class UpdateFile
		boolean quit = false;
		do {
			int n = sc.nextInt();
			switch (n) {
			case 1:
				// choose case 1 it can create file
				c.createfile(s);
				break;
			case 2:
				// choose case 2 we can pass data to the file
				a.addConfig(s);
				break;
			case 3:
				// choose case 3 we can update and save the data to the file
				u.updateConfig(s);
				break;
			case 4:
				// choose case 4 it open the file
				o.openfile(s);
				break;
			case 5:
				// choose case 5 it can delete the file
				d.filedelete(s);
				break;
			case 6:
				// we choose case 6 it exist the file
				quit = true;
				System.out.println("SUCESSFULLY QUITED APPLICATION ");
				break;
			}
		} while (!quit);

	}

}
