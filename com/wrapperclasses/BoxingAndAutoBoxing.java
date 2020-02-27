package com.wrapperclasses;

public class BoxingAndAutoBoxing {

	public static void main(String[] args) {
		byte b = 10; // Primitive
		Byte B = new Byte(b); // Wrapping primitive byte data into Byte B
		System.out.println(B);

		char c = 'C'; // Primitive
		Character C = new Character(c); // Wrapping primitive char data into Character C
		System.out.println(C);

		short s = 20; // Primitive
		Short S = new Short(s); // Wrapping primitive short data into Short S
		System.out.println(S);

		boolean bln = true; // Primitive
		Boolean BLN = new Boolean(bln); // Wrapping primitive boolean data into Boolean BLN
		System.out.println(BLN);

		// From jdk 1.5 onwards, Auto-boxing was introduced. According to this feature
		// you need not to explicitly wrap primitive content to an object. Just assign
		// primitive content to wrapper class.
		
		int i=10; //Primitive int type
		Integer I=i; //Auto-boxing of int data.
		System.out.println(I);
		
		float f=12; //Primitive float type
		Float F=f; //Auto-boxing of float data.
		System.out.println(F);

	}

}
