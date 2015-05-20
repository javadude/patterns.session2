package com.javadude.javabeans;

public class PersonSample {

	public static void main(String[] args) {
		final Person mike = new Person();
		mike.setName("Mike");
		mike.setAddress("123 Sesame");
		mike.setAge(48);

		final Person sue = new Person();
		sue.setName("Sue");
		sue.setAddress("123 Sesame");
		sue.setAge(47);
	}
}
