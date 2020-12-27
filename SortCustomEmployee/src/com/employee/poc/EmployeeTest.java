package com.employee.poc;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import com.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {

		
		Set<Employee> empList = new TreeSet<>();
		empList.add(new Employee(105,"Mohan","Gaya"));
		empList.add(new Employee(102,"Shayam","Pune"));
		empList.add(new Employee(150,"Kamal","Bangalore"));
		empList.add(new Employee(106,"Rishi","Gaya"));
		
		empList.stream().forEach(System.out::println);
	}

}
