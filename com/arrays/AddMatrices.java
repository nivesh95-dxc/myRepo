package com.arrays;

public class AddMatrices {

	public static void main(String[] args) {
		int rows=2, columns=3;
		int[][] firstMatrix= {{2,3,4},{5,2,3}};
		int[][] secondMatrix= {{1,-2,3},{4,8,6}};
		
		//Adding two matrices
		int[][] sum=new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				sum[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
			}
		}
		
		//Displaying the fields
		for(int[]row:sum) {
			for(int column:row) {
				System.out.println(column+" ");
			}
			System.out.println();
		}

	}

}
