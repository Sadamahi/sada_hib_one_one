package com.java8.interview;

import java.util.ArrayList;

public class City_start_with_A {

	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("A12");
		cityList.add("A13");
		cityList.add("A93");
		cityList.add("A43");
		cityList.add("6104");
		cityList.add("A07");
		cityList.add("a46");
		cityList.add("B46");
		
		//Not Manipulate original value in the list
		cityList.stream().filter(i -> i.toUpperCase().startsWith("A")).forEach(System.out::println);

		System.out.println("**********************************");
		//Manipulate original value in the list
		cityList.stream().map(i -> i.toUpperCase()).filter(i -> i.startsWith("A")).forEach(System.out::println);

		System.out.println("**********************************");
		//Manipulate original value in the list
		cityList.stream().map(String::toUpperCase).filter(i -> i.startsWith("A")).forEach(System.out::println);

	}

}
