package com.arrays;

public class ArrayOfObjects {

	public static void main(String[] args) {
		UserDefinedType[] arrayOfUserDefined = new UserDefinedType[10];
		A[] superClassObject = new A[5];
		for (int i = 0; i < arrayOfUserDefined.length; i++) {
			arrayOfUserDefined[i] = new UserDefinedType();
		}
		arrayOfUserDefined[1].methodOne();
		for (int i = 0; i < superClassObject.length; i++) {
			superClassObject[i] = new B();
		}
		superClassObject[2].methodTwo();
		int[] a;
		a = new int[5]; // 'a' is the reference variable pointing to array object
		a[1] = 10;
		a[3] = 30;
		System.out.println(a.length);
		A[] z;
		z=new A[5];
		z[1]=new A();
		z[3]=new A();
		System.out.println(z.length);

	}

}

class UserDefinedType {
	int i;

	void methodOne() {
		System.out.println("From user defined type object");
	}
}

class A {
	int i;

	void methodTwo() {
		System.out.println("From super class");
	}
}

class B extends A {
	void methodTwo() {
		System.out.println("From sub class");
	}
}
