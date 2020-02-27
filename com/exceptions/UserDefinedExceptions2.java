package com.exceptions;

import java.util.Scanner;

public class UserDefinedExceptions2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int balance=5000;
		System.out.println("Enter withdrawal amount");
		int withdrawalMoney=sc.nextInt();
		if(withdrawalMoney>balance) {
			try {
				throw new InvalidWithdrawalMoneyException("Withdrawal amount exceeds balance");
			} catch (InvalidWithdrawalMoneyException e) {
				System.out.println(e);
			}
		}

	}

}

@SuppressWarnings("serial")
class InvalidWithdrawalMoneyException extends Exception{
	String errorMessage;
	public InvalidWithdrawalMoneyException(String errorMessage) {
		this.errorMessage=errorMessage;
	}
	
	public String toString() {
		return errorMessage;
	}
}
