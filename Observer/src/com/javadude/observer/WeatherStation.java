package com.javadude.observer;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class WeatherStation {
	public WeatherStation() {
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(1,0,5,5));
		JButton roseButton = new JButton("Sun Rose");
		JButton setButton = new JButton("Sun Set");
		frame.add(roseButton);
		frame.add(setButton);
		
		roseButton.addActionListener(e -> System.out.println("Rose button was pressed!"));
		setButton.addActionListener(e -> System.out.println("Set button was pressed!"));
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
