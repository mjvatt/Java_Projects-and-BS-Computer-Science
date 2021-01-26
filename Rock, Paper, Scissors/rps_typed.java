package git_hub_projects;

import java.util.Random;
import javax.swing.JOptionPane;

public class rps_typed {

	protected static String question;
	public static String input; 
	protected static String compChoice;
	protected static final String[] computerChoices = {"rock", "paper", "scissors"};
	protected static int userAnswer; 
	
	public static void main(String[] args) {
		
		getUserInput();
		
	}
	
	protected static void getUserInput() {

		question = "Enter rock, paper, or scissors: ";
		input = JOptionPane.showInputDialog(question);
		JOptionPane.showMessageDialog(null, "Thank you for inputting: " + input + ".");
		getComputerChoice();
		
	}
	
	protected static void getComputerChoice() {
		
		Random random = new Random(); 
		int index = random.nextInt(computerChoices.length);
		JOptionPane.showMessageDialog(null, "Computer has chosen: " + computerChoices[index]);
		compChoice = computerChoices[index];
		check();
		
	}
	
	protected static void check() {
		
		if(input.equals(compChoice)) {
			JOptionPane.showMessageDialog(null, "It was a tie!");
		} else if(input.equals("rock") && compChoice.equals("paper")) {
			JOptionPane.showMessageDialog(null, "Sorry, you have lost. Try again!");
		} else if(input.equals("rock") && compChoice.equals("scissors")) {
			JOptionPane.showMessageDialog(null, "Congratulations, you won!!!");
		} else if(input.equals("paper") && compChoice.equals("scissors")) {
			JOptionPane.showMessageDialog(null, "Sorry, you have lost. Try again!");
		} else if(input.equals("paper") && compChoice.equals("rock")) {
			JOptionPane.showMessageDialog(null, "Congratulations, you won!!!");
		} else if(input.equals("scissors") && compChoice.equals("rock")) {
			JOptionPane.showMessageDialog(null, "Sorry, you have lost. Try again!");
		} else if(input.equals("scissors") && compChoice.equals("paper")) {
			JOptionPane.showMessageDialog(null, "Congratulations, you won!!!");
		}	

	}
	
}
