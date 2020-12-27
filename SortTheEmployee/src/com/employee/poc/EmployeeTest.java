package com.employee.poc;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.model.Employee;
import com.util.MyEmployeeComparator;

public class EmployeeTest {
	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		//Set<Employee> empList = new HashSet<>();
		//Set<Employee> empList = new TreeSet<>();
		//Set<Employee> empList = new TreeSet<>(new MyEmployeeComparator());
		
		empList.add(new Employee(106,"Rishi","Gaya"));
		empList.add(new Employee(105,"Mohan","Gaya"));
		empList.add(new Employee(102,"Shayam","Pune"));
		empList.add(new Employee(150,"Kamal","Bangalore"));
		empList.add(new Employee(106,"Rishi","Gaya"));
		empList.add(new Employee(106,"Pawan","Gaya"));
		empList.add(new Employee(107,"Rishi","Gaya"));
		empList.add(new Employee(106,"Anand","Gaya"));
		empList.add(new Employee(106,"Babu","Gaya"));
		empList.add(new Employee(108,"Avind","Gaya"));
		empList.stream().forEach(System.out::println);
	}

}
