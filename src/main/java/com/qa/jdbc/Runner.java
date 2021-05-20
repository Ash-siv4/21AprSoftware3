package com.qa.jdbc;

import java.util.Scanner;

public class Runner {

	private static Scanner sc = new Scanner(System.in);

	private static String getInput() {
		System.out.println("Enter CRUD choice:");
		return sc.nextLine();
	}

	public static void main(String[] args) {

		// initialise/ create an instance of the class
		Sql db = new Sql();

		String crud = getInput();
		try {
			do {
				switch (crud.toLowerCase()) {
				case "create":
					System.out.println("Enter name of alcohol: ");
					String name = sc.nextLine();
					System.out.println("Enter units: ");
					Double units = sc.nextDouble();
					sc.nextLine();
					db.create(name, units);
					System.out.println("created");
					break;
				case "read":
					db.read();
					break;
				case "readone":
					System.out.println("Enter id of alcohol: ");
					int id = sc.nextInt();
					sc.nextLine();
					db.readById(id);
					break;
				case "update":
					break;
				case "delete":
					break;
				default:
					System.out.println("invalid option");
				}
				crud = getInput();
			} while (!crud.equals("exit"));
			System.out.println("end.....");
		} finally {
			db.close();
		}
	}

}
