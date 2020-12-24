package com.java8.interview;

import java.util.ArrayList;
import java.util.function.Predicate;

import javax.print.attribute.standard.PresentationDirection;

public class LazyLoadingFilter {

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

		// hear filetr is lazy loading

		/*
		 * Predicate<String> p = i -> {
		 * System.out.println("calling filter every time"); return
		 * i.startsWith("B"); };
		 */
		
		// Hear filetr is lazy loading
		cityList.stream().map(String::toUpperCase).filter(i -> {
			System.out.println("calling filter every time");
			return i.startsWith("A");
		});
		System.out.println("Before Lazy loading**********************");
		cityList.stream().map(String::toUpperCase).filter(i -> {
			System.out.println("calling filter every time");
			return i.startsWith("A");
		}).forEach(System.out::println);;
		
		System.out.println("after Lazy loading**********************");
		cityList.stream().map(String::toUpperCase).filter(i -> i.startsWith("A")).forEach(System.out::println);
		;

	}

}
