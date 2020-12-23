package com.myjava.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.myjava.java8.Employee;

public class FindElement {
	public static void main(String[] args) {
		List<Employee> allEmp = Arrays.asList(new Employee("Phil Smith", 45, "London"),
				new Employee("John Wiseman", 52, "London"), 
				new Employee("Cathy Cooper", 42, "New Delhi"),
				new Employee("Harry Major", 25, "New Delhi"), 
				new Employee("Meena Singh", 56, "Mumbai"),
				new Employee("Rohit Sharma", 1, "Chennai"));
		
		Optional<Employee> emp = allEmp.stream()
								.filter(e -> e.getAge() > 40)
								.findAny();
		if(emp.isPresent()) {
		System.out.println("Employee - "+ emp);
		} else {
			System.out.println("No employee found mathcing criteria");
		}
	}

}
