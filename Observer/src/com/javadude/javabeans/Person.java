package com.javadude.javabeans;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

// JavaBean with bound properties
//    public get/set methods define read/write "properties"
public class Person {
	private String name;
	private String address;
	private int age;

	private List<PropertyChangeListener> propertyChangeListeners = new ArrayList<PropertyChangeListener>();
	
	public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
		propertyChangeListeners.add(propertyChangeListener);
	}
	public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener) {
		propertyChangeListeners.remove(propertyChangeListener);
	}
	private void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
		if (oldValue == null || !oldValue.equals(newValue)) {
			for (PropertyChangeListener propertyChangeListener : propertyChangeListeners) {
				propertyChangeListener.propertyChange(new PropertyChangeEvent(this, propertyName, oldValue, newValue));
			}
		}
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
		firePropertyChange("name", oldValue, name);
	}

	// defines read/write property "age"
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		int oldValue = this.age;
		this.age = age;
		firePropertyChange("name", oldValue, age);
	}
	
	// defines read/write property "address"
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		String oldValue = this.address;
		this.address = address;
		firePropertyChange("address", oldValue, address);
	}
}
