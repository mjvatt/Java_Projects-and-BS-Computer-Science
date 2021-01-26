package git_hub_projects;

import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class QuestionDialog extends JDialog implements ActionListener {

	// Create variable to store user input
	String answer;

	public void actionPerformed(ActionEvent e) {
		
		answer = e.getActionCommand();
		dispose();
		
	}
	
}
