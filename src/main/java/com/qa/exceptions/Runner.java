package com.qa.exceptions;

public class Runner {

	public static void method() throws ArithmeticException {
		System.out.println(3/0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ---------------------- EXCEPTIONS ---------------------

		int[] arr = { 0, 1, 2 };

		try {
//			Integer.parseInt("2s");
			System.out.println(arr[5]);
			System.out.println("try");
		} catch (NumberFormatException e) {
			System.out.println("caught");
		} catch (ArithmeticException e) {
			System.out.println("caught 2");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("caught 3");
			System.out.println(arr[2]);
		}

		method();
		System.out.println("olloooo");

	}

}
