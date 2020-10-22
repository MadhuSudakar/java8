package com.streamapi.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterSearchProg {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "ROHITH", 45000, "BANGALORE"));
		list.add(new Employee(102, "VARUN", 36000, "HYDERABAD"));
		list.add(new Employee(103, "ROHITH", 52000, "MUMBAI"));
		list.add(new Employee(104, "KOHLI", 55000, "VIZAG"));
		list.add(new Employee(105, "DOHNI", 53000, "DELHI"));

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employer Salary");
		// String userName = sc.nextLine();
		Integer salary = sc.nextInt();

		/*
		 * Set<Employee> employee = list.stream().filter(name ->name.getEmpName().equals(userName)) .collect(Collectors.toSet());
		 */
		List<Employee> employee = list.stream().filter(name -> name.getEmpSalary() <= salary).collect(Collectors.toList());

		for (Employee emp : employee) {
			System.out.println(
					emp.getEmpId() + " " + emp.getEmpName() + " " + emp.getEmpSalary() + " " + emp.getEmpAddress());
		}

	}
}
