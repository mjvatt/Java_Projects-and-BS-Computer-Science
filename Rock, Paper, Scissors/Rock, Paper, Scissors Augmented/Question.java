package git_hub_projects;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import javax.swing.JOptionPane;

public class Question {
	
	// Create necessary variables and options
	static String compChoice;
	protected static final String[] computerChoices = {"Rock", "Paper", "Scissors"};
	static QuestionDialog question; 
	
	// Start the game
	static String ask() {
		
		question.setVisible(true);
		return question.answer;	

	}
	
	// Provide message to the user to start play
	Question(String question){
		
		Question.question = new QuestionDialog();
		Question.question.setLayout(new GridLayout(0,1));
		Question.question.add(new JLabel("   " + question + "   ", JLabel.CENTER));
		
	}
	
	// Create the dialog box
	void initQuestionDialog() {
		
		question.setModal(true);
		question.pack();
		question.setLocationRelativeTo(null);
		
	}
	
	// Start the game, retrieve both user and computer inputs, check for outcomes, 
	// and ask the user if they want to play again
	static void check() {
		
		String input = ask();
		System.out.println("THIS IS A TEST");
		getComputerChoice();
		showResults(input, compChoice);
		playAgain();
		
	}
	
	// This will check for the possible outcomes
	static void showResults(String input, String compChoice) {
		
		if(input.equals(compChoice)) {
			JOptionPane.showMessageDialog(null, "It was a tie!");
		} else if(input.equals("Rock") && compChoice.equals("Paper")) {
			JOptionPane.showMessageDialog(null, "Sorry, you have lost. Try again!");
		} else if(input.equals("Rock") && compChoice.equals("Scissors")) {
			JOptionPane.showMessageDialog(null, "Congratulations, you won!!!");
		} else if(input.equals("Paper") && compChoice.equals("Scissors")) {
			JOptionPane.showMessageDialog(null, "Sorry, you have lost. Try again!");
		} else if(input.equals("Paper") && compChoice.equals("Rock")) {
			JOptionPane.showMessageDialog(null, "Congratulations, you won!!!");
		} else if(input.equals("Scissors") && compChoice.equals("Rock")) {
			JOptionPane.showMessageDialog(null, "Sorry, you have lost. Try again!");
		} else if(input.equals("Scissors") && compChoice.equals("Paper")) {
			JOptionPane.showMessageDialog(null, "Congratulations, you won!!!");
		}	
		
	}
	
	// Randomly return opponent's (computer) choice of rock, paper, or scissor
	static String getComputerChoice() {
		
		Random random = new Random(); 
		int index = random.nextInt(computerChoices.length);
		JOptionPane.showMessageDialog(null, "Computer has chosen: " + computerChoices[index]);
		return compChoice = computerChoices[index];
		
	}
	
	// Ask user if they want to play again
	static void playAgain() {
		
		String playAgain;
		int cont;
		playAgain = "Want to play again?";
		
		int dialogButton = JOptionPane.YES_NO_OPTION;
		cont = JOptionPane.showConfirmDialog(null,  playAgain, "Warning", dialogButton);
		if(cont == JOptionPane.YES_OPTION) {
			check();
		}
		
	}
	
}
