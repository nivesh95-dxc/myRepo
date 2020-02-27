package com.enums;

enum Colors implements AnyInterface{
	RED, BLUE, BLACK, GREEN; //RED  //-Duplicate fields are not allowed

	@Override
	public void methodOfInterface() {
		// TODO Auto-generated method stub
		
	} //RED  //-Duplicate fields are not allowed
}

enum Streams{
	CSE, ECE, MECH;
	int i=1;
	Streams(){
		
	}
	void methodOfEnum() {
		
	}
}

enum enums{
	FIRST{
		int j=10;
		void methodOfA() {
			System.out.println("Common method written in FIRST");
			System.out.println(j);
		}

		@Override
		void abstractMethod() {
			methodOfA();
		}
	},
	SECOND{
		int k=20;
		void methodOfB() {
			System.out.println("Common method written in SECOND");
			System.out.println(k);
		}

		@Override
		void abstractMethod() {
			methodOfB();
			
		}
	};
	int i;
	void commonMethod() {
		System.out.println("Generalized method, written to all constants");
	}
	abstract void abstractMethod();
}


public class EnumerationsPractice {
	enum names{
		ANUJ,DIVYA,HARNEET
	}

	public static void main(String[] args) {
		System.out.println(ConstantsWithoutEnums.East);
		System.out.println(ConstantsWithoutEnums.North);
		System.out.println(ConstantsWithoutEnums.West);
		System.out.println("______________________");
		
		Colors c1=Colors.RED;
		System.out.println(c1);
		
		Colors c2=Colors.BLUE;
		System.out.println(c2);
		
		System.out.println(Colors.BLACK);
		System.out.println(Colors.GREEN);
		System.out.println("______________________");
		Streams st=Streams.CSE;
		System.out.println(st.i); //Constant "ECE has field 'i'
		st.methodOfEnum(); //Constant "ECE" has methodOfEnum.
		Streams st1=Streams.ECE;
		Streams st2=Streams.MECH;
		System.out.println(st.toString()+" "+st1.toString()+" "+st2.toString());
		System.out.println("______________________");
		System.out.println(EnumerationsPractice.names.ANUJ);
		System.out.println(EnumerationsPractice.names.DIVYA);
		System.out.println(EnumerationsPractice.names.HARNEET);
		System.out.println("______________________");
		enums.FIRST.commonMethod();
		enums.SECOND.commonMethod();
		System.out.println("______________________");
		//System.out.println(enums.FIRST.j); //Compile time error : Field j is not visible here
		enums.FIRST.abstractMethod();
		//enums.FIRST.methodOfA();//Compile time error : methodOfA is not visible here
		enums.SECOND.abstractMethod();
	}

}
class ConstantsWithoutEnums{
	public static final String North="NORTH";
	public static final String East="EAST";
	public static final String West="WEST";
}

interface AnyInterface{
	abstract void methodOfInterface();
}
