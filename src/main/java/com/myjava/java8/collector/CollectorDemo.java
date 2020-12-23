package com.myjava.java8.collector;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.myjava.java8.Employee;

public class CollectorDemo {
	public static void main(String[] args) {
		List<Employee> allEmp = Arrays.asList(new Employee("Phil Smith", 45, "London"),
				new Employee("John Wiseman", 52, "London"), 
				new Employee("Cathy Cooper", 42, "New Delhi"),
				new Employee("Harry Major", 56, "New Delhi"), 
				new Employee("Meena Singh", 56, "Mumbai"),
				new Employee("Rohit Sharma", 21, "Chennai"));

		Map <Boolean, List<Employee>> empMap = allEmp.stream()
		.collect(Collectors.partitioningBy((Employee e) -> e.getAge() > 40));
		
		empMap.forEach((key, empList) -> System.out.println(key + " -> " + empList));	
		
		Long totalEmployees = allEmp.stream()
							  .collect(Collectors.counting());
		System.out.println("Total Employees - " + totalEmployees);
		
		Optional<Employee> eldestEmp = allEmp.stream()
		.collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
		
		System.out.println("Eldest employee - " + (eldestEmp.isPresent() ? eldestEmp : "No such employee"));
	}
}
