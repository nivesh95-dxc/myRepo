package com.exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class OverridingWithThrows {
	void methodOfSuperClass() throws SQLException, NullPointerException, FileNotFoundException {
		System.out.println("Super class method is throwing checked and unchecked exception");
	}
}

class SubClass extends OverridingWithThrows {
	void methodOfSuperClass() throws ArrayIndexOutOfBoundsException {
		System.out.println("Can be overrided with any unchecked Exception");
	}
}

class SubClassOne extends OverridingWithThrows {
	void methodOfSuperClass() throws NullPointerException, NumberFormatException, ArithmeticException {
		System.out.println("Can be overrided with any unchecked Exception");
	}
}

class SubClassTwo extends OverridingWithThrows {
	void methodOfSuperClass() throws SQLException {
		System.out.println("Can be overridden with checked exception of same or lower scope");
	}
}

class SubClassThree extends OverridingWithThrows {
	/*
	 * void methodOfSuperClass() throws Exception{ //Compile time error //Cannot be
	 * overridden with exception of higher scope }
	 */
}
