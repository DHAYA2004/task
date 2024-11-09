package com.project.student;

import java.util.Scanner;

public class StudentDAO {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// user information
		System.out.println("Enter firstname: ");
		String fname = in.next();
		System.out.println("Enter lastname: ");
		String lname = in.next();
		System.out.println("Enter RegNo: ");
		String regNo=in.next();
		System.out.println("Enter PhoneNo: ");
		String PhoneNo=in.next();

		
		// create obj for DTO class
		StudentDTO DTOObj = new StudentDTO(fname, lname,regNo,PhoneNo);
		System.out.println(
				"\n *******\nEnter Choice: \n1 show information\n2 Store data in file\n3 Display data from file\n4 Exit\n******");

		try {
		
			int choice;
			do {

				choice = in.nextInt();
				switch (choice) {
				case 1:
					DTOObj.showInfo();
					break;
				case 2:
					DTOObj.storeFile();
					break;
				case 3:
					DTOObj.readFile();
					break;
				case 4:
					System.out.println("Thankyou for using Application");
					break;

				default:
					System.err.println("Invalid choice,please enter valid choice");
				}
			} while (choice != 4);

		} catch (Exception ime) {
			ime.printStackTrace();
			
		}
	}
}


