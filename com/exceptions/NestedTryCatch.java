package com.exceptions;

public class NestedTryCatch {

	public static void main(String[] args) {
		String s[]= {"abc","123", null, "xyz", "456"};
		System.out.println(s);
		for(int i=0;i<s.length;i++) {
			try {
				int intValue=s[i].length();
				System.out.println(intValue);
				try {
					intValue=Integer.parseInt(s[i]);
					System.out.println(intValue);
				}catch(NumberFormatException e) {
					System.out.println("Number Format exception will be caught");
				}
			}catch (NullPointerException e) {
				System.out.println("Null Pointer exception will be caught");
			}
		}
		try {
			nestedTry();
		} catch (Exception e) {
			System.out.println("ArithmeticException will be handled here");
		}

	}
	
	static void nestedTry() {
		try {
			int j=100/0;
			System.out.println(j);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception will be handled here");
		}
	}

}
