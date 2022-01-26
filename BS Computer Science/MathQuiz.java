// CS 1103 - Unit 1 Lab 1
// Date: 17 NOV 2020

import javax.swing.JOptionPane;
import java.util.Random;

public class MathQuiz {
	
	static String[] questions = new String[15];
	static int question = 0;
	static int[] userAnswers = new int[15];
	static int[] answers = new int[15]; 
	static double nCorrect = 0;
	static int nQuestions = 0;
	static int firstTry = 0;
	static int secondTry = 0;
	static int i;
	static int a;
	static int b;

	static String answer;
	static int userAnswer;
	
	// This will administer a new quiz and return results once complete
	public static void main(String[] args) {
		
		newQuiz();
		results();
		
	}

	// This will build a new quiz
	private static void newQuiz() {
		
		int[] choice = new int[10];
		Random generator = new Random();
		for(i = 0; i < 10; i++) {
			choice[i] = generator.nextInt(4)+1;
			a = (int)(30*Math.random()+1); // add 1 to prevent multiplying by 0
			b = (int)(10*Math.random()+1); // add 1 to prevent dividing by 0

			switch(choice[i]) {
				case 1:
					addition();
					break;
				case 2:
					subtraction();
					break;
				case 3:
					multiplication();
					break;
				case 4:
					division();
					break;
			}
		}
	}
	
	static void addition() {
		// Addition Problems
		questions[i] = "Addition: What is " + a + " + " + b + " = ?";
		answer = JOptionPane.showInputDialog(questions[i]);
		userAnswers[i] = Integer.parseInt(answer);
		answers[i] = a + b;
		nQuestions++;
		check();
	}
	
	static void subtraction() {
		// Subtraction Problems
		questions[i] = "Subtraction: What is " + a + " - " + b + " = ?";
		answer = JOptionPane.showInputDialog(questions[i]);
		userAnswers[i] = Integer.parseInt(answer);
		answers[i] = a - b;
		nQuestions++;
		check();
	}
	
	static void multiplication() {
		// Multiplication Problems
		questions[i] = "Multiplication: What is " + a + " x " + b + " = ?";
		answer = JOptionPane.showInputDialog(questions[i]);
		userAnswers[i] = Integer.parseInt(answer);
		answers[i] = a * b;
		nQuestions++;
		check();
	}
	
	static void division() {
		// Division Problems
		questions[i] = "Division: What is " + a + " / " + b + " = ?";
		answer = JOptionPane.showInputDialog(questions[i]);
		userAnswers[i] = Integer.parseInt(answer);
		answers[i] = a / b;
		nQuestions++;
		check();

	}
	
	// This will check to see if the user answers are correct
	static void check() {
		if(userAnswers[i] == answers[i]) {
			JOptionPane.showMessageDialog(null, "Correct!");
			nCorrect++;
			firstTry++;
		} else if(userAnswers[i] != answers[i]) {
			JOptionPane.showMessageDialog(null, "Incorrect, please try again.");
			questions[i] = questions[i];
			answer = JOptionPane.showInputDialog(questions[i]);
			userAnswers[i] = Integer.parseInt(answer);
			if(userAnswers[i] == answers[i]) {
				JOptionPane.showMessageDialog(null, "Correct!");
				nCorrect += 0.5;
				secondTry++;
			} else {
				JOptionPane.showMessageDialog(null, "Sorry, that is still incorrect.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is: " + answers + ".");
		}
	}
	
	// This will return the overall results of the quiz
	public static void results() {
		
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " points."
				+ " You got " + firstTry + " correct on the first try and " + secondTry 
				+ " on the second try.");
		
	}
}


