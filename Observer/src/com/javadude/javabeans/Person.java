package com.javadude.javabeans;


// Simple JavaBean with properties
//    public get/set methods define read/write "properties"
public class Person {
	private String name;
	private String address;
	private int age;

	// Properties:
	//   public TYPE getNAME()  - readable
	//   public void setNAME(TYPE value)  - writeable

	// defines read/write property "name"
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// defines read/write property "age"
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
