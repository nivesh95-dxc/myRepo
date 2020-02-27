package com.arrays;

public class TwoDArray {

	public static void main(String[] args) {
		int[] firstElement= {1,2,3};
		int[] secondElement= {4,5,6};
		int[] thirdElement= {7,8,9};
		
		//Two-D Array
		int[][] twoDimensionalArray= {firstElement,secondElement,thirdElement};
		for(int i=0;i<twoDimensionalArray.length;i++) {
			System.out.println("{");
			for(int j=0;j<twoDimensionalArray[i].length;j++) {
				System.out.println(twoDimensionalArray[i][j]+"\t");
			}
			System.out.println("}");
			System.out.println();
		}

	}

}
