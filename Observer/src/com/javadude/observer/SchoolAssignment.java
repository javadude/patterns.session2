package com.javadude.observer;

public class SchoolAssignment {

	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		Student willy = new Student("Willy", weatherStation);
		Student billy = new Student("Billy", null);
		Student silly = new Student("Silly", weatherStation);
		Student sally = new Student("Sally", null);
		
		weatherStation.addSunListener(willy);
		weatherStation.addSunListener(billy);
		weatherStation.addSunListener(silly);
		weatherStation.addSunListener(sally);
	}
}
