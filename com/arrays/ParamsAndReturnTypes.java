package com.arrays;

public class ParamsAndReturnTypes {

	public static void main(String[] args) {
		double[] d=new double[5];
		d[2]=2.8;
		d[4]=3.7;
		methodOne(d); //Passing array to method
		System.out.println(d[2]);
		System.out.println(d[4]);

	}
	
	static void methodOne(double[] d) {
		d[2]=25.3; //Changing the value of element at index 2
		d[4]=43.6; //Changing the value of element at index 4
	}

}
