package com.util;

import java.util.Comparator;

import com.model.Employee;

public class MyEmployeeComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {

		Employee e1 = (Employee) obj1;
		Employee e2 = (Employee) obj2;
		int id1 = e1.getId();
		int id2 = e2.getId();
		/*
		 * int comparison = 0; if (id1 == id2) { comparison =
		 * e1.getName().compareTo(e2.getName()); }
		 */

		//return comparison;

		if (id1 < id2) {
			return -1;
		} else if (id1 > id2) {
			return 1;
		} else {
			return  e1.getName().compareTo(e2.getName());
		}

	}

}
