
/**
 * Administers a quiz to the user consisting of 10 randomly selected
 * addition and subtraction problems.  The user gets 10 points for
 * each correct answer, and the score is reported at the end.
 */
public class Maths {
	
	private static String[] questions;    // The quiz questions.
	private static int[] correctAnswers;  // Correct answer to each question.
	private static int[] userAnswers;     // Answers given by the user.
	
	/**
	 * The main() routine creates and administers the quiz and reports results.
	 * It also creates the global arrays that are used to store the program's data.
	 */
	public static void main(String[] args) {
		questions = new String[10];
		correctAnswers = new int[10];
		userAnswers = new int[10];
		createQuiz();
		administerQuiz();
		reportResults();
	}
	
	/**
	 * Creates a set of 10 random problems.  The questions are stored
	 * in the global array named "questions", and the correct answers to
	 * the questions are stored in the global array named "correctAnswers."
	 */
	private static void createQuiz() {
		int i;  // A question number, from 0 to 9.
		for (i = 0; i < 10; i++) {
			int a,b;
			a = (int)(99*Math.random() + 1);
			b = (int)(41*Math.random());
			if (Math.random() < 0.5) { // create an addition problem
				questions[i] = "What is " + a + " + " + b + " ?";
				correctAnswers[i] = a + b;
			}
			else { // create a subtraction problem with a non-negative answer
				if ( b > a ) { // if b > a, swap the values to make b <= a
					int temp = a;
					a = b;
					b = a;
				}
				questions[i] = "What is " + a + " - " + b + " ?";				
				correctAnswers[i] = a - b;
			}
		}
	}
	
	/**
	 * Ask the user each of the 10 questions on the quiz, and get
	 * the user's answers.  (Does not score the quiz or give any
	 * feedback to the user; just get's the user's answers.  The
	 * user's answers are stored in the global array named "userAnswers".
	 */
	private static void administerQuiz() {
	}
	
	/**
	 * Computes and reports the user's score, and tells the user
	 * the correct answers for the questions that the user answered
	 * incorrectly.  Uses all the data stored in the global array
	 * variables questions, correctAnswers, and userAnswers.
	 */
	private static void reportResults() {
	}

}
