package com.myjava.java8.inheritance;

interface AA {
	public default void printA() {
		System.out.println("printA() of interface AA");
	}
}
interface BB extends AA {
	public default void printA() {
		System.out.println("printA() of interface BB");
	}
}

class CC implements BB {
	
}
public class MultipleInheritanceDemo2 {
	public static void main(String[] args) {
		CC obj = new CC();
		obj.printA();
	}
}
