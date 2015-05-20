package com.javadude.observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ButtonExample {
	private static class ButtonReport implements ActionListener {
		@Override public void actionPerformed(ActionEvent e) {
			System.out.println("Button was pressed!");
		}
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("Press Me");
		frame.add(button);
		
		ButtonReport buttonReport = new ButtonReport();
		button.addActionListener(buttonReport);
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
