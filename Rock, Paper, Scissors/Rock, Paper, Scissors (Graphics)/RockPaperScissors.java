package git_hub_projects;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.*; 
import javax.swing.*;

public class RockPaperScissors {

	private static int win;
	private static int tie;
	private static int total;
	private static int gamesWon; 


	public static void main(String[] args){ 
		
		welcomePanel(); 
		playGame();
		
	}

	private static void welcomePanel(){ 
		
		String text="                                   Rock, Paper, Scissors!\n \nThis game is about endless fun for the whole family to enjoy!\n \n"
				+ "It is simple to learn and play whenever and wherever you want!\n \nJust remember the rules!\n  - Rock beats scissors\n  "
				+ "- Scissors beats paper\n  - Paper beats rock\n \n           (Yes, somehow paper is better than rock).";
		JOptionPane.showMessageDialog(null,text, "Instructions: Come Play!", 0, new ImageIcon(System.getProperty("user.dir")+"/src/git_hub_projects/rock_paper_scissors.png"));
	
	}

	private static void playGame(){ 

		JFrame frame = new JFrame("Rock, Scissors, Paper"); 
		
		Container panel = frame.getContentPane();  
		panel.setLayout(null); 

		String[] iconString= new String[3]; 
		int[] boundInt= new int[3]; 
		
		for(int i=0; i<=2; i++){ 
			
			iconString[i]=System.getProperty("user.dir")+"/image/"+i+".jpg";
			boundInt[i]=40+300*i;
			
		}

		JButton b1 = new JButton (" ", new ImageIcon(System.getProperty("user.dir")+"/src/git_hub_projects/good rock.png"));
		b1.setBackground(Color.white);
		b1.setBounds(40,boundInt[0],450,250);


		JButton b2 = new JButton (" ", new ImageIcon(System.getProperty("user.dir")+"/src/git_hub_projects/good paper.png"));
		b2.setBackground(Color.white);
		b2.setBounds(40,boundInt[1],450,250);

		JButton b3 = new JButton (" ", new ImageIcon(System.getProperty("user.dir")+"/src/git_hub_projects/good scissors.png"));
		b3.setBackground(Color.white);
		b3.setBounds(40,boundInt[2],450,250);//creating three buttons

		JButton b4 = new JButton("Quit"); //quit
		b4.setBounds(650, 860, 150, 40);
		
		JButton b5 = new JButton (" ", new ImageIcon(System.getProperty("user.dir")+"/src/git_hub_projects/the_legend.png"));
		b5.setBounds(550, 280, 625, 400);
		panel.add(b5);//creating a question button

		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4); 

		b1.addActionListener( 

				new ActionListener() {
					public void actionPerformed( ActionEvent event ) {
						computeWinner(1);
					}
				}
		);

		b2.addActionListener(

				new ActionListener() {
					public void actionPerformed( ActionEvent event ) {
						computeWinner(2);
					}
				}
		);

		b3.addActionListener(

				new ActionListener() {
					public void actionPerformed( ActionEvent event ) {
						computeWinner(3);
					}
				}
		);

		b4.addActionListener( //quit the game and show three beat up guys

				new ActionListener() {
					public void actionPerformed( ActionEvent event ) {
						String text="Wow, you are good! Those pesky rocks, scissors, and papers were too much for me!\n \n Thank you for playing! "
								+ "I have to go take the computer to the hospital now.";
						JOptionPane.showMessageDialog(null,text, "Thank you for playing!", 0, new ImageIcon(System.getProperty("user.dir")+"/image/6.gif"));
						System.exit(0);
						
					}
				}
		);

		frame.setSize(1250, 1000); 
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
	}

	public static void computeWinner(int x){ 
		
		int compPick = (int)(Math.random()*3) + 1;	
		int userPick = x;
		String text,text1 = "";
		String determineWinner = "" + Math.min(compPick, userPick) + Math.max(compPick, userPick);

		switch(Integer.parseInt(determineWinner)){

		case 12:
			
			text = "Rock wins!";
			if(userPick == 1) gamesWon=1;
			break;
			
		case 13:
			
			text = "Paper wins!";
			if(userPick == 2) gamesWon=1;
			break;
			
		case 23:
			
			text = "Scissors wins!";
			if(userPick == 3) gamesWon=1;
			break;
			
		default: text="It is a tie!";
		gamesWon=2;
		tie=tie+1;
		
		}
		
		if(gamesWon==1){
			
			text1="Human wins!  ";
			gamesWon=0;
			win=win+1;
			total=total+1;
			
		} else if(gamesWon==2){
			
			text1="It is a tie!  ";
			gamesWon=0;		
			
		} else{
			
			text1="Computer wins!  ";
			total=total+1;
			
		}

		JFrame frame = new JFrame("Rock, Scissors, Paper"); 
		Container panel = frame.getContentPane(); 
		panel.setLayout(null); 


		JLabel l0 = new JLabel(text1+text, SwingConstants.CENTER);
		l0.setBounds(75, 10, 600, 35);
		panel.add(l0);

		// Final Results
		
		JLabel l1 = new JLabel("Human's Choice");
		l1.setBounds(135, 35, 150, 35);
		panel.add(l1);

		JLabel l2 = new JLabel("Computer's Choice");
		l2.setBounds(525, 35, 150, 35);
		panel.add(l2);

		JLabel l3 = new JLabel(new ImageIcon(System.getProperty("user.dir")+"/src/git_hub_projects/"+(userPick)+".png"));
		l3.setBounds(10, 75, 340, 200);
		panel.add(l3);

		JLabel l4 = new JLabel(new ImageIcon(System.getProperty("user.dir")+"/src/git_hub_projects/"+(compPick)+".png"));
		l4.setBounds(400, 75,340, 200);
		panel.add(l4);

		JLabel l5 = new JLabel("Win/Loss rate: " + win+"/"+total);
		l5.setBounds(325, 75, 150, 500);
		panel.add(l5);

		JLabel l6 = new JLabel("Tie: "+tie);
		l6.setBounds(125, 30, 125, 370);
		panel.add(l6);

		frame.setSize(800, 400); 
		frame.setVisible(true); 		

	}

}
