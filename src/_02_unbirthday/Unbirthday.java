package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String birthday = JOptionPane.showInputDialog(null, "What is your birthday? mm/dd");
			
			if( birthday.equals("09/06")) {
				JOptionPane.showConfirmDialog(null, "Happy Birthday");
			}else {
				JOptionPane.showConfirmDialog(null, "Happy UNbirthday" + birthday);
			}
	}

}
