package com.qa;

public class StaticKW {

	// variables - there is a single copy and this copy is shared
	static int a = 6;
	// int b = 4; //cannot call this variable inside a static method

	// blocks - executes once to initialise the static variables...
	static {
		int c = 3;
		int x = 8;
		System.out.println("static block");
	}

	// methods
	static void method3() {
		System.out.println("hello");
		System.out.println(a);

		int b = 4;// local variable
		System.out.println(b);
	}

	// nested classes
	static class A {
		static void method2() {
			System.out.println(a);
			method3();
		}
	}

}
