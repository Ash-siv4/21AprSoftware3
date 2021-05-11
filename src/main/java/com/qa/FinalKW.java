package com.qa;

public class FinalKW {

	int num;

	void method() {
		System.out.println(num);
	}

	// variables - constants
	final double pi = 3.14;

	// methods
	final void setup() {
		String username = "root";
		String pass = "root";
		// jdbc connection to pass these values in and connect to the DB
	}

	// classes - cannot inherit from a final class

	// final - can only assign it once, fixed, cannot update

	public void method1() {
		System.out.println(pi);
//		StaticKW.A.method2();
	}
}
