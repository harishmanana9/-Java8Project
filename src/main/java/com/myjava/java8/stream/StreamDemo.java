package com.myjava.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.myjava.java8.Employee;

public class StreamDemo {
	public static void main(String[] args) {
		List<Employee> allEmp = Arrays.asList(new Employee("Phil Smith", 45, "London"),
				new Employee("John Wiseman", 52, "London"), new Employee("Cathy Cooper", 42, "New Delhi"),
				new Employee("Harry Major", 25, "New Delhi"), new Employee("Meena Singh", 56, "Mumbai"),
				new Employee("Rohit Sharma", 1, "Chennai"));

//		List<Employee> emp = allEmp.stream()
//							.filter((Employee e) -> e.getAge() > 40)
//							.filter(e -> e.getAge() < 50)
//							.limit(2)
//							.collect(Collectors.toList());

//		allEmp.stream()
//		.filter(e -> e.getAge() > 40)
//		.filter(e -> e.getCity().equals("New Delhi"))
//		.collect(Collectors.toList())
//		.forEach(System.out::println);

		if (allEmp.stream().allMatch(e -> e.getAge() > 20)) {
			System.out.println("All employees age is more than 20");
		} else {
			System.out.println("May be someone is minor");
		}

		if (allEmp.stream().anyMatch(e -> e.getAge() > 20)) {
			System.out.println("At least one employee age is more than 20");
		} else {
			System.out.println("All are less than 20");
		}

		if (allEmp.stream().noneMatch(e -> e.getAge() > 20)) {
			System.out.println("All employees are less than 20");
		} else {
			System.out.println("At least one employee are more than 20");
		}
	}
}
