package com.hcl.expencentry;

import java.util.Scanner;
/*
 * 
 * this class create constructor and pass the values 
 * and create the two methods Expenditure(),Display()
 * we can read values to scanner class to expenditure()
 */

public class ExpenceEntry {
	Scanner Input = new Scanner(System.in);
	public String name, AccType, Name, exptype;
	public long Salaryamt, amount, savings;

	public ExpenceEntry(String name, String AccType, long salaryamt) {
		super();
		this.name = name;
		this.AccType = AccType;
		this.Salaryamt = salaryamt;

	}

	public int ExpenditureType() {
		//we can read all data to the scanner class
		System.out.println("Please Enter Name :");
		Name = Input.nextLine();
		System.out.println("Please Enter Expenditure Type:");
		exptype = Input.nextLine();
		System.out.println("Please Enteramount :");
		amount = Input.nextLong();
		if (Salaryamt < 0) {
			System.out.println("Your enter invalid amount");
			return 1;
		}
		savings = Salaryamt - amount;
		return 0;

	}

	public void Display() {
		//this method is used to print the all value 
		System.out.println("##############################################");
		System.out.println("Name:" + name);
		System.out.println("AccountType:" + AccType);
		System.out.println("Salary:" + Salaryamt);
		System.out.println("#############################################");
		System.out.println("Expenditure Type:" + Name);
		System.out.println("Expenditure Description:" + exptype);
		System.out.println("Expenditure Amount:" + amount);
		System.out.println("#############################################");
        
		//it can check the condition  and print value savings
		if (savings < 0) {
			System.out.println("Your Expenditure is cross Your amount :" + savings);
			System.out.println("---------------------------------------------------");
		} else {

			System.out.println("Your Reamining amount :" + savings);
			System.out.println("---------------------------------------------------");
		}
	}
}
