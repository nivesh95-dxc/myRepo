package com.exceptions;

public class ReturningValues {

	public static void main(String[] args) {
		System.out.println(methodReturningValue());
		System.out.println(methodReturningValue2());
	}

	static int methodReturningValue() {
		try {
			// This block may or may not return a value
		} catch (Exception e) {
			// This block may or may not return a value
		} finally {
			return 20;
		}

	}
	
	public static void main1(String[] args) {
		try {
			return;
		} catch (Exception e) {
			return;
		}finally {
			return;
		}
		//System.out.println("Unreachable code");  Unreachable code
		
	}
	
	static int methodReturningValue2() {
		try {
			return 10;
		} catch (Exception e) {
			return 20;
		}finally {
			System.out.println("This block will always execute");
		}
	}

}
