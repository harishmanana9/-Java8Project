package com.myjava.java8;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<String> helloStr = () -> new String("Hello");
		System.out.println("String - " + helloStr.get());
		
		Supplier<Date> sysDate = () -> new Date();
		System.out.println("Date - " + sysDate.get());
	}
}
