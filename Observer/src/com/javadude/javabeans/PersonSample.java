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
		
		mike.addPropertyChangeListener(e -> {if ("address".equals(e.getPropertyName())) sue.setAddress(mike.getAddress());});
		sue.addPropertyChangeListener(e -> {if ("address".equals(e.getPropertyName())) mike.setAddress(sue.getAddress());});
		
		mike.setAddress("1313 Mockingbird Lane");
	}

}
