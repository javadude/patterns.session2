package com.javadude.observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ButtonExample {
	private static class ButtonReport implements ActionListener {
		private int num;
		
		public ButtonReport(int num) {
			this.num = num;
		}

		@Override public void actionPerformed(ActionEvent e) {
			System.out.println(num + " Button was pressed!");
		}
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("Press Me");
		frame.add(button);
		
		button.addActionListener(new ButtonReport(1));
		button.addActionListener(new ButtonReport(2));
		button.addActionListener(new ButtonReport(3));
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
