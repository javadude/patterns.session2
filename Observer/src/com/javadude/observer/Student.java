package com.javadude.observer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Observer // not needed, but can be nice for marking your intent
public class Student implements SunListener {
	private DateFormat dateFormat = SimpleDateFormat.getTimeInstance();
	private String name;
	
	public Student(String name) {
		this.name = name;
	}

	@Override
	public void sunRose(Calendar calendar) {
		System.out.println(name + ": Sun rose: " + dateFormat.format(calendar.getTime()));
	}

	@Override
	public void sunSet(Calendar calendar) {
		System.out.println(name + ": Sun set: " + dateFormat.format(calendar.getTime()));
	}

}
