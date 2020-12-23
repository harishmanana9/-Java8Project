package com.myjava.java8;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		Integer val1 = null;
		Integer val2 = new Integer(10);

		Optional<Integer> v1 = Optional.ofNullable(val1); // allowd null
		Optional<Integer> v2 = Optional.of(val2); // allowd non-null, if null then throw exception
		Integer result = addOptional(v1, v2);
		System.out.println("Result : " + result);
		
//		Integer sum = add(val1, val2);
//		System.out.println("Sum : " + sum);
	}
	
	public static Integer add(Integer v1, Integer v2) {
		return v1 + v2;
	}
	
	public static Integer addOptional(Optional<Integer> v1, Optional<Integer> v2) {
		System.out.println("v1 is present -- " + v1.isPresent());
		System.out.println("v2 is present -- " + v2.isPresent());
		
		Integer value1 = v1.orElse(new Integer(0));
		Integer value2 = v2.get();
		return value1 + value2;
	}
}
