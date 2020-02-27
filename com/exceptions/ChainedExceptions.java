package com.exceptions;

public class ChainedExceptions {

	public static void main(String[] args) {
		try {
			NumberFormatException ex=new NumberFormatException();
			ex.initCause(new NullPointerException("This is the actual cause"));
			throw ex;
		} catch (NumberFormatException ex) {
			System.out.println(ex);
			System.out.println(ex.getCause());
		}

	}

}
