package com.model;

public class Employee //implements Comparable 
{

	private int id;

	private String name;

	private String City;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", City=" + City + "]";
	}

	public Employee(int id, String name, String city) {

		this.id = id;
		this.name = name;
		City = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	/*
	 * @Override public boolean equals(Object obj) { int id = this.id; if (obj
	 * instanceof Employee) { Employee emp = (Employee) obj; if (id == emp.id) {
	 * return true; } else { return false; } } return false; }
	 * 
	 * @Override public int hashCode() { // TODO Auto-generated method stub return
	 * id + "".hashCode(); }
	 */
	/*@Override
	public int compareTo(Object arg) {
		Employee emp = (Employee) arg;
		int id1 = this.id;
		int id2 = emp.id;

		if (id1 < id2) {
			return -1;
		} else if (id1 > id2) {
			return 1;
		} else {
			return 0;
		}

	}
  */
}
