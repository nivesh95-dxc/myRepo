package com.arrays;

import java.util.Arrays;

public class ArrayUtils {

	public static void main(String[] args) {
		byte[] b= {10,20,30};
		System.out.println(Arrays.toString(b));
		
		short[] s= {10,20,30};
		System.out.println(Arrays.toString(s));
		
		char[] c= {'A','B','C','D'};
		System.out.println(Arrays.toString(c));
		
		boolean[] bln= {true,true,false};
		System.out.println(Arrays.toString(bln));
		
		int[] i= {27,45,13,23,78,11};
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		
		long[] l= {34,541,657,233,125};
		Arrays.sort(l);
		System.out.println(Arrays.toString(l));

	}

}
