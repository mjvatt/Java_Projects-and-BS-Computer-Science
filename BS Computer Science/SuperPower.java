// Created by: Michael Vatt
// CS 1102 - Unit 1 Programming Assignment
// Date: 07 SEP 2020

import javax.swing.JOptionPane;

public class SuperPower {

	public static void main(String[] args)
	{
	
		String power = JOptionPane.showInputDialog("What is your superpower?");
		power = power.toUpperCase();
		JOptionPane.showMessageDialog(null, power + " TO THE RESCUE!");
		
	}
	
}
