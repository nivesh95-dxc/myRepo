package com.exceptions;

import java.util.Scanner;

public class UserDefinedExceptions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		try {
			if(age<0) {
				throw new AgeIsNegativeException("Age cannot be smaller than 0");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

class AgeIsNegativeException extends Exception{
	String errorMessage;
	public AgeIsNegativeException(String errorMessage) {
		this.errorMessage=errorMessage;
	}
	
	public String toString(){
		return errorMessage;
	}
}
