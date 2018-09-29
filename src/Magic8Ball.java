import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {
		int rand = new Random().nextInt(4);
		System.out.println(rand);

		String question = JOptionPane.showInputDialog("Enter a question for the magic 8 ball");

		if (rand == 0) {
			System.out.println("yes");
		}

		else if (rand == 1) {
			System.out.println("No");
		}

		else if (rand == 2) {
			System.out.println("Maybe you should ask Google");
		}

		else if (rand == 3) {
			System.out.println("Who knows");
		}

	}
}
