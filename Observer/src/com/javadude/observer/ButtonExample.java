package com.javadude.observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ButtonExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("Press Me");
		frame.add(button);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
