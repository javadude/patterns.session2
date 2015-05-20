package com.javadude.observer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Observer // not needed, but can be nice for marking your intent
public class Student implements SunListener {
	private DateFormat dateFormat = SimpleDateFormat.getTimeInstance();
	private String name;
	private WeatherStation weatherStation;
	
	public Student(String name, WeatherStation weatherStation) {
		this.name = name;
		this.weatherStation = weatherStation;
	}

	@Override
	public void sunRose(Calendar calendar) {
		System.out.println(name + ": Sun rose: " + dateFormat.format(calendar.getTime()));
		if (weatherStation != null) {
			weatherStation.removeSunListener(this);
		}
	}

	@Override
	public void sunSet(Calendar calendar) {
		System.out.println(name + ": Sun set: " + dateFormat.format(calendar.getTime()));
		if (weatherStation != null) {
			weatherStation.removeSunListener(this);
		}
	}

}
