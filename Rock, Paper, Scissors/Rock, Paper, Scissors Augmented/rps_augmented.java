package git_hub_projects;

public class rps_augmented {
	
	public static void main(String[] args) {
		
		Question question = new MultipleChoiceQuestion(
				"Please choose rock, paper, or scissors?",
				"Rock",
				"Paper",
				"Scissors");
		
		Question.check();
	
	}
		
}
