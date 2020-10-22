package com.functionalInterface.java8;

interface MyInterfaceOne {

	void show();

	default void display() {
		System.out.println("Interface One");
	}
}

interface MyInterfaceTwo{
	void show();

	default void display() {
		System.out.println("Interface Two");
		//MyInterfaceOne.super.display();
	}
}

public class MultipleInterfacesProg implements MyInterfaceOne {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show method implementation");
	}

	/*@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hi This is MultipleInterfacesProg");
		MyInterfaceTwo.super.display();
		
	}*/

	public static void main(String[] args) {

		MultipleInterfacesProg mul = new MultipleInterfacesProg();
		mul.display();
	}
}
