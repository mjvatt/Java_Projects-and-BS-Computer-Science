import javax.swing.*;

public class LearningJournalOne {

	
	public static void main(String[] args) {
		
		play();
		
	}
	
	private static void play() {
		
		double a;
		double b;
		double c;
		double correctAnswer;
		String answer;
		String error;
		String answer1;
		String answer2;
		String answer3;
	
		String intro;
		String question1;
		String question2;
		String question3;
		
		intro = "Please enter 3 values, one at a time, to take the place of A, B, and C in the quadratic equation (Ax^2 + Bx + C)";
		JOptionPane.showMessageDialog(null, intro);
		question1 = "Please enter the value for A:";
		answer1 = JOptionPane.showInputDialog(question1);
		question2 = "Please enter the value for B:";
		answer2 = JOptionPane.showInputDialog(question2);
		question3 = "Please enter the value for C:";
		answer3 = JOptionPane.showInputDialog(question3);
		
		a = Double.parseDouble(answer1);
		b = Double.parseDouble(answer2);
		c = Double.parseDouble(answer3);
		
		try {
			correctAnswer = (double) Math.round(root(a, b, c)*100)/100;
			answer = "The correct answer is: " + correctAnswer;
			JOptionPane.showMessageDialog(null, answer);
		} catch(IllegalArgumentException e) {
			error = "There seems to be an error in finding a solution.";
			JOptionPane.showMessageDialog(null, error);
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		String playAgain;
		int cont;
		playAgain = "Want to play again?";
		
		int dialogButton = JOptionPane.YES_NO_OPTION;
		cont = JOptionPane.showConfirmDialog (null, playAgain,"Warning",dialogButton );
		if(cont == JOptionPane.YES_OPTION){
			play();
		}
	}
	
	/**
	 * Returns the larger of the two roots of the quadratic equation
	 * A*x*x + B*x + C = 0, provided it has any roots.  If A == 0 or
	 * if the discriminant, B*B - 4*A*C, is negative, then an exception
	 * of type IllegalArgumentException is thrown.
	 */
	static public double root( double A, double B, double C ) throws IllegalArgumentException {
	    if (A == 0) {
	      throw new IllegalArgumentException("A can't be zero.");
	    }
	    else {
	       double disc = B*B - 4*A*C;
	       if (disc < 0)
	          throw new IllegalArgumentException("Discriminant < zero.");
	       return  (-B + Math.sqrt(disc)) / (2*A);
	    }
	}
}
