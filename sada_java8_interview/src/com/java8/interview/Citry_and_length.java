package com.java8.interview;

import java.util.ArrayList;

public class Citry_and_length {

	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("Pune");
		cityList.add("Kolkata");
		cityList.add("Delhi");
		cityList.add("Mumbai");
		cityList.add("Kochi");
		//cityList.stream().forEach(Test:: m1);
		cityList.stream().forEach(i->{System.out.println(i+" : "+i.length());});
		
	}
	public static void m1(String s) {
		System.out.println(s+" : "+s.length());
	}

}
