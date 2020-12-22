package com.myjava;

@FunctionalInterface
public interface Calc {
	public final static int NO = 200;
	public abstract int square(int a);
	
	public default int add(int a, int b) {
		return a+b;
	}
	public default int subtract(int a, int b) {
		return a-b;
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}
}