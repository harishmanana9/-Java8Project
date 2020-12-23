package com.myjava.java8.inheritance;

interface A {
	public default void printA() {
		System.out.println("printA() of interface A");
	}
}
interface B {
	public default void printA() {
		System.out.println("printA() of interface B");
	}
}
class X {
	public void printA() {
		System.out.println("printA() of class X");
	}
}
class C implements A, B {

	@Override
	public void printA() {
		// TODO Auto-generated method stub
		A.super.printA();
	}
	
}
public class MultipleInheritanceDemo {
	public static void main(String[] args) {
		C obj = new C();
		obj.printA();
	}
}
