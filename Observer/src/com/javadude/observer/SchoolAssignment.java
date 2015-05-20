package com.javadude.observer;

public class SchoolAssignment {

	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		Student willy = new Student("Willy");
		Student billy = new Student("Billy");
		Student silly = new Student("Silly");
		Student sally = new Student("Sally");
		
		weatherStation.addSunListener(willy);
		weatherStation.addSunListener(billy);
		weatherStation.addSunListener(silly);
		weatherStation.addSunListener(sally);
	}
}
