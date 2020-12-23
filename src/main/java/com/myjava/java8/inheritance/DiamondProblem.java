package com.myjava.java8.inheritance;

interface AAA {
	public default void printA() {
		System.out.println("printA() of interface AAA");
	}
}
interface BBB extends AAA {
	public default void printA() {
		System.out.println("printA() of interface BBB");
	}
}

interface CCC extends AAA {
	public default void printA() {
		System.out.println("printA() of interface CCC");
	}
}

class XXX implements BBB, CCC {
	@Override
	public void printA() {
		// TODO Auto-generated method stub
		CCC.super.printA();
	}
	
}
public class DiamondProblem {
	public static void main(String[] args) {
		CC obj = new CC();
		obj.printA();
	}
}
