package com.arrays;
//An Array is a group of elements having similar data-type

import java.util.Arrays;

public class BasicArrays {

	public static void main(String[] args) {
		int arrayOfints[];
		double[] arrayOfDoubles= {2,8,6,4,9};
		char[] arrayOfChars;
		boolean arrayOfBooleans[];
		arrayOfints=new int[10];
		arrayOfints[2]=15;
		arrayOfints[5]=32;
		System.out.println(arrayOfints[2]);
		System.out.println(arrayOfDoubles[1]);
		
		//Copying an Array using for loop
		int[] a= {12,8,31,7,93};
		int[] b=new int[a.length];
		try {
			for(int i=0;i<6;i++) {
				b[i]=a[i];
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		a[2]=56;
		System.out.println(a[2]);
		System.out.println(b[2]);
		b[3]=85;
		System.out.println(a[3]);
		System.out.println(b[3]);
		
		//Copying an array using copyOf method of java.util
		int[] x= {51,65,4,32,11};
		int[] y=Arrays.copyOf(x, x.length);
		for(int j=0;j<y.length;j++) {
			System.out.println(b[j]);
		}
		y[2]=59;
		System.out.println(y[2]);
		System.out.println(x[2]);
		y[4]=84;
		System.out.println(y[4]);
		System.out.println(x[4]);
		
		//Copying an array using clone method
		int[] q= {50,69,32,15,86};
		int[] w=q.clone();
		for(int k=0;k<w.length;k++) {
			System.out.println(w[k]);
		}
		w[2]=59;
		System.out.println(w[2]);
		System.out.println(q[2]);
		w[4]=84;
		System.out.println(w[4]);
		System.out.println(q[4]);
		
		//Copying an array using arraycopy() method
		String[] s= {"12","34","45","56","nivesh"};
		String[] t= new String[s.length];
		System.arraycopy(s, 0, t, 0, s.length);
		for(int l=0;l<t.length;l++) {
			System.out.println(t[l]);
		}
		t[4]="anuj";
		System.out.println(s[4]);
		System.out.println(t[4]);

	}	

}
