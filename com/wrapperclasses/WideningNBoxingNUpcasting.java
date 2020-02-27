package com.wrapperclasses;

public class WideningNBoxingNUpcasting {
	
	static void overLoadedMethod(Integer I) {
		System.out.println("Sabka baap");
	}
	
	/*static void overLoadedMethod(int i) {
		System.out.println("Integer ka beta");
	}*/
	
	static void overLoadedMethod(Long L) {
		System.out.println("Long wrapper class type");
	}

	static void overLoadedMethod(Double D) {
		System.out.println("Double wrapper class type");
	}

	public static void main(String[] args) {
		int i = 20;
		overLoadedMethod(i); // Partial:- The method overLoadedMethod(Long) and
		// overLoadedMethod(Double) in the type WideningNBoxingNUpcasting is not
		// applicable for the arguments (int)

	}

}
