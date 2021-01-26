package git_hub_projects;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import javax.swing.JOptionPane;

public class Question {

	static String compChoice;
	protected static final String[] computerChoices = {"Rock", "Paper", "Scissors"};
	static QuestionDialog question; 
	
	static String ask() {
		
		question.setVisible(true);
		return question.answer;	

	}
	
	Question(String question){
		
		Question.question = new QuestionDialog();
		Question.question.setLayout(new GridLayout(0,1));
		Question.question.add(new JLabel("   " + question + "   ", JLabel.CENTER));
		
	}
	
	void initQuestionDialog() {
		
		question.setModal(true);
		question.pack();
		question.setLocationRelativeTo(null);
		
	}
	
	static void check() {
		
		String input = ask();
		System.out.println("THIS IS A TEST");
		getComputerChoice();
		showResults(input, compChoice);
		playAgain();
		
	}
	
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
	
	static String getComputerChoice() {
		
		Random random = new Random(); 
		int index = random.nextInt(computerChoices.length);
		JOptionPane.showMessageDialog(null, "Computer has chosen: " + computerChoices[index]);
		return compChoice = computerChoices[index];
		
	}
	
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
