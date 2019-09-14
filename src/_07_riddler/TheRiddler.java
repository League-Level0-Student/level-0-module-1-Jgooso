package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0
import javax.swing.JOptionPane;


public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog(null, "What is the center of gravity?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (answer.contentEquals("v")) {
			JOptionPane.showConfirmDialog(null, "correct");
			score++;
		}else {
			JOptionPane.showConfirmDialog(null, "Wrong. The correct answer is V");
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		answer = JOptionPane.showInputDialog(null, "What has roots as nobody sees, Is taller than trees, Up, up, up it goes And yet, never grows");  
				
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (answer.contentEquals("mountain")) {
			JOptionPane.showConfirmDialog(null, "correct");
			score++;
		}else {
			JOptionPane.showConfirmDialog(null, "Wrong. The correct answer is mountain");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showConfirmDialog(null, String.valueOf(score));
	}

	
}

