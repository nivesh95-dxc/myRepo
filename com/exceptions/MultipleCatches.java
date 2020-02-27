package com.exceptions;

public class MultipleCatches {

	public static void main(String[] args) {
		String s[] = { "abc", "123", null, "xyz", "456" };
		for (int i = 0; i < 6; i++) {
			try {
				int intValue = Integer.parseInt(s[i]) + s[i].length();
				System.out.println(intValue);
			} catch (NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}catch (Exception ex) {
				System.out.println("This block handles all kind of exceptions");
			}
			System.out.println("After executing respective blocks, this statement will be executed");
		}

	}

}
