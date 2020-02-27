package com.wrapperclasses;

public class ConstructorsNWrapping {

	public static void main(String[] args) {
		Byte B1 = new Byte((byte) 10); // Constructor which takes Byte value as arg.
		Byte B2 = new Byte("10"); // Constructor which takes String value as arg.
		/*
		 * Byte B3=new Byte("abc"); Exception in thread "main"
		 * java.lang.NumberFormatException: For input string: "abc" at
		 * java.lang.NumberFormatException.forInputString(Unknown Source)
		 */

		Short S1 = new Short((short) 20); // Constructor which takes short value as arg.
		Short S2 = new Short("20"); // Constructor which takes String value as arg.

		Float F1 = new Float((float) 12); // Constructor which takes float value as an argument
		Float F2 = new Float("12"); // Constructor which takes String as an argument
		Float F3 = new Float(12f); // Constructor which takes float value as an argument
		Float F4 = new Float(12d); // Constructor which takes double value as an argument
		System.out.println(F1.toString() + " " + F2.toString() + " " + F3.toString() + " " + F4.toString());

		Character C1 = new Character('S');
		// Character C2=new Character("abc"); The constructor Character(String) is
		// undefined

		Boolean BLN1 = new Boolean("true");
		System.out.println(BLN1);

		Boolean BLN2 = new Boolean("false");
		System.out.println(BLN2);

		Boolean BLN3 = new Boolean("abc");
		System.out.println(BLN3);

		float f = Float.parseFloat("1238.59714046541f");
		System.out.println(f);

		int i = Integer.parseInt("2350972");
		System.out.println(i);

		double d = Double.parseDouble("4820587d");
		System.out.println(d);

		// ValueOf Method:-
		// Primitive type as argument
		Byte B = Byte.valueOf((byte) 12);
		System.out.println(B);

		Short S = Short.valueOf((short) 2);
		System.out.println(S);

		Boolean BLN = Boolean.valueOf((boolean) false);
		System.out.println(BLN);

		// String value as argument
		Integer I = Integer.valueOf("123");
		System.out.println(I);

		Float F = Float.valueOf("123.45f");
		System.out.println(F);

		// Character C=Character.valueOf("C"); The method valueOf(char) in the type
		// Character is not applicable for the arguments (String)
		
		Double D=Double.valueOf("1234.5678d");
		System.out.println(D);
		
		Long L=Long.valueOf("12345");
		System.out.println(L);
		
		// String and int as arguments
		
		Byte B8=Byte.valueOf("10110", 2);
		System.out.println(B8);
		
		Short S3=Short.valueOf("30", 5);
		System.out.println(S3);
		
		Integer I2=Integer.valueOf("4673AB", 12);
		System.out.println(I2);
	}

}
