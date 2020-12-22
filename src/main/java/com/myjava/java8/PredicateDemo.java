package com.myjava.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		
		Predicate<Employee> ageMoreThanForty = e -> e.getAge() > 40;
		
		List<Employee> allEmp = Arrays.asList(new Employee("Phil Smith", 45, "London"),
				new Employee("John Wiseman", 52, "London"),
				new Employee("Cathy Cooper", 42, "New Delhi"),
				new Employee("Harry Major", 25, "New Delhi"));
		
		List<Employee> filterEmp = filterList(allEmp, ageMoreThanForty.and(e -> e.getAge()<50));
		filterEmp.forEach(System.out::println);
	}
	
	public static List<Employee> filterList(List<Employee> empList, Predicate<Employee> funcObj) {
		List<Employee> names = new ArrayList<Employee>();
		for(Employee emp : empList) {
			if(funcObj.test(emp)) {
				names.add(emp);
			}
		}
		return names;
	}
}
