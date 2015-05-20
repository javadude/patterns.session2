package com.javadude.javabeans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// JavaBean with bound properties
//    public get/set methods define read/write "properties"
public class Person {
	private String name;
	private String address;
	private int age;

	// PropertyChangeSupport manages the list and fires events on our behalf
	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(listener);
	}
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}
	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
	}
	public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(propertyName, listener);
	}
	
	// Properties:
	//   public TYPE getNAME()  - readable
	//   public void setNAME(TYPE value)  - writeable

	// defines read/write property "name"
	public String getName() {
		return name;
	}
	public void setName(String name) {
		String oldValue = this.name;
		this.name = name;
		propertyChangeSupport.firePropertyChange("name", oldValue, name);
	}

	// defines read/write property "age"
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		int oldValue = this.age;
		this.age = age;
		propertyChangeSupport.firePropertyChange("name", oldValue, age);
	}
	
	// defines read/write property "address"
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		String oldValue = this.address;
		this.address = address;
		propertyChangeSupport.firePropertyChange("address", oldValue, address);
	}
}
