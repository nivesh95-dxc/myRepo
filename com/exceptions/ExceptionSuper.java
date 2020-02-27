package com.exceptions;

public class ExceptionSuper {

	public static void main(String[] args) {
		try {
		int i=Integer.parseInt("abc");
		System.out.println(i);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("This block handles all exceptions");
		}catch(Throwable e) {
			System.out.println("Throwable is a super class of Exception");
		}
	}

}
