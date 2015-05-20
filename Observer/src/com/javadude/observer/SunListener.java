package com.javadude.observer;

import java.util.Calendar;

@Observer // not needed, but can be nice for marking your intent
public interface SunListener {
	void sunRose(Calendar calendar);
	void sunSet(Calendar calendar);
}
