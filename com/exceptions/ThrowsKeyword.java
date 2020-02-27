package com.exceptions;

//The main use of throws keyword in java is that an exception can be propagated through method calls.
public class ThrowsKeyword {

	public static void main(String[] args) {
		try {
			methodFour();
			A a = new A(null);
		} catch (ClassNotFoundException | NullPointerException e) {
			System.out.println("ClassNotFoundException and NullPointer exceptions are handled here");
		}
		
		try {
			methodThree();
		} catch (NumberFormatException e) {
			System.out.println("Number Format exception will be caught here");
		}

	}

	static void methodWithThrows() {
		int i = Integer.parseInt("abc"); // Throws NumberFormatException
		String s = null;
		System.out.println(s.length()); // Throws NullPointerException
	}

	static void methodTwo() {
		methodWithThrows(); // Exception is propagated here
	}

	static void methodThree() {
		methodTwo(); // Exception is propagated here
	}

	static void methodFour() throws ClassNotFoundException {
		Class.forName("xyz");
	}

}

// Even constructor can use throws keyword.
class A {
	int i;

	A(String s) throws NullPointerException {
		i = s.length();
	}
}
