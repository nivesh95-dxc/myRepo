package com.wrapperclasses;

public class UnboxingandAutoUnboxing {

	public static void main(String[] args) {
		Byte B=new Byte((byte)10); //Byte object
		byte b=B.byteValue(); //Unwrapping Byte object into byte data
		System.out.println(b);
		
		Character C=new Character((char)'C'); //Character object
		char c=C.charValue(); //Unwrapping Character object into char data
		System.out.println(c);
		
		Boolean BLN=new Boolean((boolean)true); //Boolean object
		boolean bln=BLN.booleanValue(); //Unwrapping Boolean object into boolean data
		System.out.println(bln);
		
		String STR=new String((String)"ABC");
		String str=STR.toString();
		System.out.println(str);
		
		//jdk 1.5 onwards, auto un-boxing was introduced
		Integer I=new Integer((int)30);
		int i=I;
		System.out.println(i);
		
		Float F=new Float((float)13);
		float f=F;
		System.out.println(f);

	}

}
