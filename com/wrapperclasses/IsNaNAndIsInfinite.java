package com.wrapperclasses;

public class IsNaNAndIsInfinite {

	public static void main(String[] args) {
		double D1=Double.NaN;
		System.out.println(D1);
		
		double d2=Double.POSITIVE_INFINITY;
		System.out.println(d2);
		
		double d3=Double.NEGATIVE_INFINITY;
		System.out.println(d3);
		
		float f1=Float.NaN;
		System.out.println(f1);
		
		float f2=Float.POSITIVE_INFINITY;
		System.out.println(f2);
		
		float f3=Float.NEGATIVE_INFINITY;
		System.out.println(f3);
		
		double d=0.0/0.0;
		System.out.println(Double.isNaN(d));
		
		d=Math.sqrt(-1.2);
		System.out.println(Double.isNaN(d));
		
		float f=0.0f/0.0f;
		System.out.println(Float.isNaN(f));
		
		double d4=Double.POSITIVE_INFINITY/0.0;
		System.out.println(Double.isInfinite(d4));
		
		d4=Double.NEGATIVE_INFINITY/0.0;
		System.out.println(Double.isInfinite(d4));
		
		float f4=Float.POSITIVE_INFINITY/0.0f;
		System.out.println(Float.isInfinite(f4));
		
		f4=Float.NEGATIVE_INFINITY/0.0f;
		System.out.println(Float.isInfinite(f4));

	}

}
