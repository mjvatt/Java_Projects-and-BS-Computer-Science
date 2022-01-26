// CS 1102 - Unit 4 Programming Assignment
// Date: 29 SEP 2020

import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question {

	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		
		super(query);
		correctAnswer = answer;
		correctAnswer = correctAnswer.toUpperCase();
		addChoice("A",a);
		addChoice("B",b);
		addChoice("C",c);
		addChoice("D",d);
		addChoice("E",e);
		initQuestionDialog();
		
	}
	
	void addChoice(String name, String Label) {
		
		JPanel choice = new JPanel(new BorderLayout());
		JButton button = new JButton(name);
		button.addActionListener(question);
		choice.add(button, BorderLayout.WEST);
		choice.add(new JLabel(Label + "   ", JLabel.LEFT), BorderLayout.CENTER);
		question.add(choice);
		
	}
	
}
