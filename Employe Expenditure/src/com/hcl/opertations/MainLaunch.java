package com.hcl.opertations;

import com.hcl.expencentry.*;
//import package to the out side of the class ExpenceEntry

import java.util.*;

class MainLaunch {
	/*
	 * This class defines pass details to the user and choose the option 
	 * it can call expenditure method and display all details
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employe name  :");
		String name = sc.nextLine();
		System.out.println("Enter AccountType name  :");
		String acctype = sc.nextLine();
		System.out.println("Enter Your income :");
		long salary = sc.nextLong();
		ExpenceEntry e = new ExpenceEntry(name, acctype, salary);
		int Menu;
		System.out.println("**********Employe Expenditure Apllication************");
		System.out.println("Choose Menu");
		System.out.println("1. Expenditure Type");
		System.out.println("2. Display");
		System.out.println("3. Exist");
		boolean quit = false;
		do {
			System.out.println("Please enter your choice");
			Menu = sc.nextInt();
			switch (Menu) {
			case 1:
				//choose case 1 it calls method and enter expenditure type
				e.ExpenditureType();
				break;
			case 2:
				//we can choose case 2 it display all details
				e.Display();
				break;
			case 3:
				quit = true;
				System.out.println("SUCESSFULLY QUITED APPLICATION ");
				break;
			}
		} while (!quit);
	}

}
