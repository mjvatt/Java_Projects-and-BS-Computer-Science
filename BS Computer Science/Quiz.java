// CS 1102 - Unit 5 Programming Assignment
// Date: 05 OCT 2020

public class Quiz {

	public static void main(String[] args) {
		
		Question question = new MultipleChoiceQuestion(
				"How many Marvel Cinematic Universe films (May 2008-Sep 2020) are there?",
				"21",
				"17",
				"23",
				"33",
				"19",
				"c");
		
		question.check();
		
		Question question1 = new MultipleChoiceQuestion(
				"Who made Captain America's shield?",
				"Tony Stark",	
				"Thanos",
				"Red Skull",
				"Howard Stark",
				"Black Widow",
				"d");
		
		question1.check();
		
		Question question2 = new MultipleChoiceQuestion(
				"How man Infinity Stones are there?",
				"2",
				"3",
				"4",
				"5",
				"6",
				"e");
		
		question2.check();
		
		Question question3 = new MultipleChoiceQuestion(
				"What is Deadpool's real name?",
				"Robert Redford",
				"Wade Wilson",
				"Bucky Barnes",
				"Michael Jordan",
				"Howard Hughes",
				"b");
		
		question3.check();
		
		Question question4 = new MultipleChoiceQuestion(
				"How do characters travel to Asgard?",
				"Bifrost",
				"Train",
				"Spaceship",
				"Quantum Realm",
				"The Space Stone",
				"a");
		
		question4.check();
		
		Question question5 = new TrueFalseQuestion(
				"Dr. Strange was first a Neurosurgeon before becoming an Avenger.", 
				"TRUE"); 
		
		question5.check();

		Question question6 = new TrueFalseQuestion(
				"Hydra is the archenemy of S.H.I.E.L.D..", 
				"TRUE"); 
		
		question6.check();
		
		Question question7 = new TrueFalseQuestion(
				"Loki killed Tony Stark's (Iron Man) parents.", 
				"FALSE"); 
		
		question7.check();
		
		Question question8 = new TrueFalseQuestion(
				"Avenger's Endgame is the only Marvel film to not have a post-credit scene.", 
				"TRUE"); 
		
		question8.check();
		
		Question question9 = new TrueFalseQuestion(
				"Okoye is Black Panther's sister.", 
				"FALSE"); 
		
		question9.check();

		Question.showResults();
		
				
	}
	
}

		
		

		

	


	
	



