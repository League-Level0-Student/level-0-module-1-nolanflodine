import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score= 0;
String a=JOptionPane.showInputDialog("Why did Jonny drop his ice cream cone?");
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
if (a.equals ("he got hit by a bus")) {
score++;
JOptionPane.showMessageDialog(null, "Correct");
JOptionPane.showMessageDialog(null, "Your score is "+score);
}else { JOptionPane.showMessageDialog(null, "You can't be serious.  He got hit by a bus!");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
}
String b=JOptionPane.showInputDialog("Why was Tiger in the toilet?");
if (b.equals ("he was looking for Poo")) {
JOptionPane.showMessageDialog(null, "Correct");
score++;
JOptionPane.showMessageDialog(null, "Your score is "+score);
}else { JOptionPane.showMessageDialog(null, "Wrong!  He was looking for Poo!");
}
String c=JOptionPane.showInputDialog("Why did the baby cross the road?");
if (c.equals("it was stapled to a chicken")) {
JOptionPane.showMessageDialog(null, ("Correct"));
score++;
JOptionPane.showMessageDialog(null, "Your score is "+score);
}else { JOptionPane.showMessageDialog(null, "Noo!!!  It was stapled to a chicken!");
}
String d=JOptionPane.showInputDialog("What is black, white, and red all over?");
if (d.equals("an embaressed person that is trying too hard not to be racist")) {
JOptionPane.showMessageDialog(null, "Correct");
score++;
JOptionPane.showMessageDialog(null, "Your score is "+score);
}else {JOptionPane.showMessageDialog(null, "You are a very sad person.  It was an embaressed person that was trying too hard not to be racist!");
}
if (score<=2) { JOptionPane.showMessageDialog(null, "Better luck next time!");
}else { JOptionPane.showMessageDialog(null, "You are most smartest.");
}


		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

