package com.exceptions;

public class ExceptionThrowing {

	public static void main(String[] args) {
		try {
			methodWithThrow();
		} catch (NumberFormatException ex) {
			System.out.println("Number format exception thrown in methodWithThrow() method");
		}

	}

	static void methodWithThrow() {
		String s=null;
		try {
			NumberFormatException ex = new NumberFormatException("This is an object of number format exception");
			int i=Integer.parseInt(s);
			throw ex;
		} catch (NumberFormatException ex) {
			System.out.println("Explicitly thrown number format exception will be caught");
		}
	}

}
