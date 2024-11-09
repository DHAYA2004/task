package com.project.student;

	

	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.util.Scanner;

	public class StudentDTO {
		File file = new File(
				"C:\\Users\\Dell\\Desktop\\quizapp\\StudentDataBase\\src\\com\\project\\student\\information");
		public Scanner in = new Scanner(System.in);// Scanner class(global)for this class -> it access it in any where in
													// this class
		
		private String firstname;
		private String lastname;
		private String regNo;
		private String phNo;

		
		public StudentDTO(String firstname, String lastname, String regNo2,String phoneNo) {
			this.firstname = firstname;
			this.lastname = lastname;
			this.regNo=regNo2;
			this.phNo=phoneNo;
			
		}


		
		// Show all information in single method.
		public void showInfo() {
			System.out.println("Name: " + this.firstname + "" + this.lastname);
			System.out.println("regNo: " + this.regNo);
			System.out.println("phNo: " + this.phNo);
		}

		// store in file
		public void storeFile() {
			// write file
			try {

				FileWriter fwriter = new FileWriter(file,true);
				BufferedWriter bwriter = new BufferedWriter(fwriter);
				bwriter.write("\nFirstname: " + this.firstname);
				bwriter.write("\nLastname: " + this.lastname);
				bwriter.write("\nRegNo: "+this.regNo);
				bwriter.write("\nPhone No: "+this.phNo);
				bwriter.write("\n********");

				bwriter.flush();
				bwriter.close();
				System.out.println("Data Stored...");

			} catch (Exception e) {
				System.out.println(e);
			}
		}

		
		// Reading file method
		public void readFile() {
			// read file
			try {
				FileReader freader = new FileReader(file);
				BufferedReader breader = new BufferedReader(freader);
				// .readLine() return type is String
				String line = breader.readLine();

				while (line != null) {
					line = breader.readLine();
					System.out.println(line);
				}

			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

	
