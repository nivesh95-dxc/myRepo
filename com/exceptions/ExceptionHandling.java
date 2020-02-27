package com.exceptions;

public class ExceptionHandling {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		System.out.println("This statement will be executed");
		// Statement enclosed in try-catch block
		try {
			String I = new String("abc"); // java.lang.NumberFormatException: For input string: "abc"
			System.out.println(I);
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
		System.out.println("Now, This statement will also be executed");

		// Below example throws arithmetic exception
		System.out.println(":-Below example throws arithmetic exception");
		System.out.println("this statement will be executed");
		try {
			int i = 1000 / 0;
			System.out.println(i);
		} catch (Exception e) {
			System.out.println("Exception caught");
		}

		System.out.println(":-Below example throws array index out of bounds exception");
		System.out.println("This statement will be executed");
		try {
			String s = args[0];
			System.out.println(s);
		} catch (Exception e) {
			System.out.println("Exception caught");
		}

		System.out.println(":-Below example throws class cast exception");
		System.out.println("This statement will be executed");
		Object O = new Object();
		try {
			ExceptionHandling e = (ExceptionHandling) O;
			System.out.println(e);
		} catch (Exception e) {
			System.out.println("Exception caught");
		}

		System.out.println(":-Below statement shows null pointer execption");
		System.out.println("This statement will be executed");
		String s = null;
		try {
			System.out.println(s.substring(0, 3));
			System.out.println(s);
		} catch (Exception e) {
			System.out.println("Exception caught");
		}

		String[] s2 = { "abc", "123", "xyz", "456" };
		for (int i = 0; i < s2.length; i++) {
			try {
				int intValue = Integer.parseInt(s2[i]);
				System.out.println(intValue);
			} catch (Exception e) {
				System.out.println("The thrown number format exception will be caught here");
			} finally {
				System.out.println("This block will always be executed");
			}
		}

		try {
			int j = 10 / 0;
			System.out.println(j);
			System.out.println("This statement will not be executed");
		} catch (Exception e) {
			System.out.println("This block will be executed immediately after arithmetic exception is caught");
			System.out.println("You can't keep any statements here");
		}finally {
			System.out.println("This block is always executed");
			System.out.println("You can't keep any statements here");
		}
		
		try {
			String h=null;
			System.out.println(h.length());
		} catch (Exception ex) {
			System.out.println(ex);
			ex.getMessage();
		}finally {
			System.out.println("This block will always be executed");
		}
	}

}
