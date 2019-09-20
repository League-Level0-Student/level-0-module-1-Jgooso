package _12_badgers;
import javax.swing.JOptionPane;
public class badger {
	public static void main(String args[]) {
		String mush = "mushroom ";
		String badg = "badger ";
		String sn = "snake";
		for(int i = 0; i < 2; i++) {
		for(int x = 0; x < 4; x++) {
			System.out.println(badg + badg + badg);
		}
			System.out.println(mush + mush +"\n");
	}
		for(int i = 0; i<2 ; i++) {
			System.out.println("A "+ badg + badg);
				for(int z = 0; z < 3; z++) {
					System.out.println(badg + badg + badg);
				}
				if(i == 0) {
					System.out.println(mush + mush +"\n");
				}else {
					System.out.println("mush-" + mush+"\n");
				}
		}
		for(int i = 0; i<3;i++) {
				System.out.println(badg + badg + badg);
		}
		System.out.print("\nA " + sn + ", A " + sn);
		System.out.print("\nSnaaake! A snaaaake\nOooh, it's a "+ sn);
	}
}
