package com.javadude.observer;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

@Observable  // not needed, but can be nice for marking your intent
public class WeatherStation {
	// 1 - Track the interested parties
	private List<SunListener> sunListeners = new ArrayList<SunListener>();
	
	// 2 - Allow external code to add/remove listeners
	public void addSunListener(SunListener sunListener) {
		sunListeners.add(sunListener);
	}
	public void removeSunListener(SunListener sunListener) {
		sunListeners.remove(sunListener);
	}
	
	// 3 - Notify listeners when something interesting happens
	private void notifySunRose() {
		List<SunListener> targets;
		synchronized (sunListeners) {
			targets = new ArrayList<SunListener>(sunListeners);
		}
		for (SunListener sunListener : targets) {
			sunListener.sunRose(Calendar.getInstance());
		}
	}
	private void notifySunSet() {
		List<SunListener> targets;
		synchronized (sunListeners) {
			targets = new ArrayList<SunListener>(sunListeners);
		}
		for (SunListener sunListener : targets) {
			sunListener.sunSet(Calendar.getInstance());
		}
	}
	
	public WeatherStation() {
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(1,0,5,5));
		JButton roseButton = new JButton("Sun Rose");
		JButton setButton = new JButton("Sun Set");
		frame.add(roseButton);
		frame.add(setButton);
		
		roseButton.addActionListener(e -> notifySunRose());
		setButton.addActionListener(e -> notifySunSet());
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
