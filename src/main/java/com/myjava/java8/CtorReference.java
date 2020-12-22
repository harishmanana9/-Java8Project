package com.myjava.java8;

interface EmployeeFactory {
	public abstract Employee getNewEmployee(String name, int age, String city);
}

public class CtorReference {
	public static void main(String[] args) {
		EmployeeFactory empFactory = Employee :: new;
		Employee emp = empFactory.getNewEmployee("John M", 21, "New York");
		System.out.println("Employee - " + emp);
	}
}
