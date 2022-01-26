// CS 1102 - Unit 3 Programming Assignment
// Date: 22 SEP 2020

import javax.swing.JOptionPane;

public class Quiz {

	static int nQuesitons = 0; 
	static int nCorrect = 0;
	
	static String ask(String question) {
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
				return answer;
			} else
				JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
		}
	}
	
	static void check(String question, String correctAns) {
		nQuesitons++;
		String answer = ask(question);
		if(answer.equals(correctAns)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			nCorrect++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAns + ".");
		}
	}
	
	public static void main(String[] args) {
		
		String question1 = "How many Marvel Cinematic Universe films (May 2008-Sep 2020) are there?\n";
		question1 += "A. 21\n";
		question1 += "B. 17\n";
		question1 += "C. 23\n";
		question1 += "D. 33\n";
		question1 += "E. 19\n";
		
		check(question1,"C");

		String question2 = "Who made Captain America's shield?\n";
		question2 += "A. Tony Stark\n";
		question2 += "B. Thanos\n";
		question2 += "C. Red Skull\n";
		question2 += "D. Howard Stark\n";
		question2 += "E. Black Widow\n";
		
		check(question2,"D");
		
		String question3 = "How man Infinity Stones are there?\n";
		question3 += "A. 2\n";
		question3 += "B. 3\n";
		question3 += "C. 4\n";
		question3 += "D. 5\n";
		question3 += "E. 6\n";
		
		check(question3,"E");
		
		JOptionPane.showMessageDialog(null,  nCorrect + " correct out of " + nQuesitons + " questions.");
			
	}
}

		
		
		

		

	


	
	



