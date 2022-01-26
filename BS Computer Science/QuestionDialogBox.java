import java.awt.event.*;
import javax.swing.*;

public class QuestionDialogBox extends JDialog {

	String answer;
	
	public void actionPerformed(ActionEvent e) {
		answer = e.getActionCommand();
		dispose();
		
	}

}
