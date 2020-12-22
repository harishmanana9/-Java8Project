package com.myjava.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		
		Function<Employee, String> funcForName = (Employee e) -> {return e.getName(); };
		Function<Employee, String> funcForCity = (Employee e) -> {return e.getCity(); };
		Function<Employee, Object> funcForAge = (Employee e) -> {return e.getAge(); };
		
		Function<String, String> extractFirstLetter = (String s) -> s.substring(0,  1);
		
		List<Employee> allEmp = Arrays.asList(new Employee("Phil Smith", 45, "London"),
				new Employee("John Wiseman", 52, "London"),
				new Employee("Cathy Cooper", 42, "New Delhi"),
				new Employee("Harry Major", 25, "New Delhi"));
		
		List<Object> names = extractNameFromEmpList(allEmp, funcForName.andThen(extractFirstLetter));
		for(Object name : names) {
			System.out.println("Data - " + name);
		}
	}
	
	public static List<Object> extractNameFromEmpList(List<Employee> empList, Function<Employee, Object> funcObj) {
		List<Object> names = new ArrayList<Object>();
		for(Employee emp : empList) {
			names.add(funcObj.apply(emp));
		}
		return names;
	}
}
