package com.myjava;

public class AnonymousClassDemo {
	public static void main(String[] args) {
		// Lambda Expression
//		Calc calcObj = (int x) -> { return x*x; };

//		Calc calcObj = (int x) -> x*x;

		Calc calcObj1 = (x) -> x * x;

		Calc calcObj2 = (a) -> {
			if (a > 0) {
				return a * a;
			}
			return 0;
		};

		System.out.println("Square - " + calcObj1.square(3));
		System.out.println("Addition - " + calcObj1.add(3, 4));

		MyIntf intfObj = (a, b, c) -> {
			if (a.equals(b) && a.equals(c)) {
				return true;
			}
			return false;
		};

	}
}

interface MyIntf{
	boolean compare(String a, String b, String c);
}