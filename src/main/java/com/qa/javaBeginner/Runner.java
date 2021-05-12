package com.qa.javaBeginner;

import java.util.Scanner;

import com.qa.javaBeginner.StaticKW.A;
import com.qa.javaBeginner.encapsulation.Customer;
import com.qa.javaBeginner.inheritance.Child;
import com.qa.javaBeginner.inheritance.GrandParent;
import com.qa.javaBeginner.inheritance.Parent;
import com.qa.javaBeginner.polymorphism.Bike;
import com.qa.javaBeginner.polymorphism.Car;
import com.qa.javaBeginner.polymorphism.Vehicle;

public class Runner {
	public static void main(String[] args) {

		// ------------------------- Static -------------------------

		StaticKW.method3();// call a static method
		// ---------------------
		StaticKW.A.method2();// can call method2 by calling the class then the nested class
		// OR
		A.method2();// can call method2 directly from the nested class

		// ------------------------- Final -------------------------
		FinalKW fin = new FinalKW();
		fin.method1();

		// ------------------------- Type Casting -------------------------
		// Narrowing
		double doub = 46.9;
		int doub2Int = (int) doub;
		System.out.println(doub2Int);// 46 - truncates

		// Widening
		int i = 29;
		double int2doub = i;
		System.out.println(int2doub);// 29.0

		// cast a String to an integer
		String num = "57";
		int val = Integer.parseInt(num);
		String num2 = "12";
		int val2 = Integer.parseInt(num2);
		System.out.println(num + num2);// 5712
		System.out.println(val + val2);// 69

		// ------------------------- Scanner -------------------------

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Your age is: " + age);
		sc.nextLine();
		System.out.println("Enter your name or type ?:");
		String name = sc.nextLine();
		if (name.equals("?")) {

		}
		System.out.println("Your name is: " + name);

		Customer eeyore = new Customer(name, age);
		System.out.println(eeyore.toString());

		// ------------------------- Encapsulation -------------------------

		Customer bob = new Customer("bob", 23, "123, abc lane");
		System.out.println(bob.toString());

		// ------------------------- Inheritance -------------------------

		GrandParent c = new GrandParent();
		c.genes();// method in grandparent class

		Parent b = new Parent();
		b.declaration();// method in parent class
		b.genes();// method in grandparent class

		Child a = new Child();
		a.declaration();// method in parent class
		a.genes();// method in grandparent class
		a.personality();// method in child class

		// ------------------------- Polymorphism -------------------------

		Vehicle audi = new Car(80, "Audi", true, 4, "White");

		System.out.println(audi.topSpeed());

		Vehicle honda = new Bike(40, "Honda", false, 0, "Blue");
		System.out.println(honda.topSpeed());

	}
}
