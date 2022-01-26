// CS 1102 - Unit 2 Programming Assignment
// Date: 16 SEP 2020

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		
		String question = "Who is your favorite Marvel Super Hero?\n";
		question += "A. Captain America\n";
		question += "B. Thor\n";
		question += "C. Black Panther\n";
		question += "D. Black Widow\n";
		question += "E. Scarlet Witch\n";
		String answer = JOptionPane.showInputDialog(question);
		answer = answer.toUpperCase();

		String[] answers = {"A", "B", "C", "D", "E"};
		
		while(!Arrays.asList(answers).contains(answer)) 
		{
			JOptionPane.showMessageDialog(null,"That is not an option. Please enter A, B, C, D, or E.");
			answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
		}
		
		while (Arrays.asList(answers).contains(answer)) 
		{
			if (answer.equals("B")) { 
				JOptionPane.showMessageDialog(null,"Correct! Mine too!"); 
				break;
			}
			else if (answer.equals("A")) {
				JOptionPane.showMessageDialog(null,"Great try! He is America's greatest!"); 
				break;
			}
			else if (answer.equals("C")) {
				JOptionPane.showMessageDialog(null,"He was truly amazing! He will be greatly missed :("); 
				break;
			}
			else if (answer.equals("D")) {
				JOptionPane.showMessageDialog(null,"Sorry! But she is incredible!"); 
				break;
			}
			else {
				JOptionPane.showMessageDialog(null,"Sorry again! You know who she is!? That's awesome!"); 
				break;
			}
		}
	}
}
		
		
		
		

		

	


	
	



