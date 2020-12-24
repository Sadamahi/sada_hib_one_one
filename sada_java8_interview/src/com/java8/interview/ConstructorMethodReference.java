package com.java8.interview;

public class ConstructorMethodReference {

	public static void main(String[] args) {
		Ekumeed ek = Order:: new;
		ek.getOrder(5);

	}

}

interface Ekumeed{
	Order getOrder(int i);
}

 class Order {
	 Order(){
			System.out.println("Order 0constructor");
		}
   
	Order(int i){
		System.out.println("Order 1constructor");
	}
	
	Order(int i, int j){
		System.out.println("Order 1constructor");
	}
}
