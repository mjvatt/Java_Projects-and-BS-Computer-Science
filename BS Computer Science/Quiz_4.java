// CS 1102 - Unit 4 Programming Assignment
// Date: 29 SEP 2020

public class Quiz {

	public static void main(String[] args) {
		
		MultipleChoiceQuestion question = new MultipleChoiceQuestion(
				"How many Marvel Cinematic Universe films (May 2008-Sep 2020) are there?",
				"21",
				"17",
				"23",
				"33",
				"19",
				"c");
		
		question.check();
		
		MultipleChoiceQuestion question1 = new MultipleChoiceQuestion(
				"Who made Captain America's shield?",
				"Tony Stark",	
				"Thanos",
				"Red Skull",
				"Howard Stark",
				"Black Widow",
				"d");
		
		question1.check();
		
		MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
				"How man Infinity Stones are there?",
				"2",
				"3",
				"4",
				"5",
				"6",
				"e");
		
		question2.check();
		
		MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
				"What is Deadpool's real name?",
				"Robert Redford",
				"Wade Wilson",
				"Bucky Barnes",
				"Michael Jordan",
				"Howard Hughes",
				"b");
		
		question3.check();
		
		MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(
				"How do characters travel to Asgard?",
				"Bifrost",
				"Train",
				"Spaceship",
				"Quantum Realm",
				"The Space Stone",
				"a");
		
		question4.check();
		
		MultipleChoiceQuestion.showResults();
				
	}
	
}

		
		

		

	


	
	



