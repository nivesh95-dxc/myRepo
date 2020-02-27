package com.arrays;

public class ThreeDArray {

	public static void main(String[] args) {
		int[] firstElement= {1,2,3};
		int[] secondElement= {4,5,6};
		int[] thirdElement= {7,8,9};
		int[] fourthElement= {10,11,12};
		int[] fifthElement= {13,14,15};
		int[] sixthElement= {16,17,18};
		int[] seventhElement= {19,20,21};
		int[] eighthElement= {22,23,24};
		int[] ninthElement= {25,26,27};
		
		//Two Dimensional Arrays
		int[][] twoDArray1= {firstElement,secondElement,thirdElement};
		int[][] twoDArray2= {fourthElement,fifthElement,sixthElement};
		int[][] twoDArray3= {seventhElement,eighthElement,ninthElement};
		
		//Three Dimensional Array
		int[][][] threeDArray= {twoDArray1,twoDArray2,twoDArray3};
		for(int i=0;i<threeDArray.length;i++) {
			System.out.println("{");
			for(int j=0;j<threeDArray[i].length;j++) {
				System.out.println("{");
				for(int k=0;k<threeDArray[j].length;k++) {
					System.out.println(threeDArray[i][j][k]+"\t");
				}
				System.out.println("}");
			}
			System.out.println("}");
			System.out.println();
		}

	}

}
