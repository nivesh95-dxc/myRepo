package com.arrays;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		int m,n,c,d;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no. of rows and columns for the matrix");
		m=in.nextInt();
		n=in.nextInt();
		
		int[][] matrix=new int[m][n];
		System.out.println("Enter the no. of elements of matrix");
		
		for(c=0;c<m;c++) {
			for(d=0;d<n;d++) {
				matrix[c][d]=in.nextInt();
			}
		}
		int transpose[][]=new int[n][m];
		
		for(c=0;c<m;c++) {
			for(d=0;d<n;d++) {
				transpose[d][c]=matrix[c][d];
			}
		}
		
		System.out.println("Transpose of matrix is:");
		for(c=0;c<n;c++) {
			for(d=0;d<m;d++) {
				System.out.println(transpose[c][d]+"\t");
			}
		}

	}

}
