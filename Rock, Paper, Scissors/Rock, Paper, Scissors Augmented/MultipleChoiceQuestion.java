package git_hub_projects;

import javax.swing.*;

public class MultipleChoiceQuestion extends Question {

	MultipleChoiceQuestion(String query, String a, String b, String c) {
		
		super(query);
		
		JPanel buttons = new JPanel();
		
		addButton(buttons, "Rock");
		addButton(buttons, "Paper");
		addButton(buttons, "Scissors");
		this.question.add(buttons);
		
		initQuestionDialog();
		
	}
	
	void addButton(JPanel buttons, String label) {
		
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
		
	}
	

	
}
