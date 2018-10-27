import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame("Slot Machine");
	JButton button = new JButton("Spin");
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();

	String orange = "orange.jpg";
	String pineapple = "pineapple.jpg";
	String cherry = "cherry.jpg";

	public static void main(String[] args) {
		SlotMachine sm = new SlotMachine();
		sm.gui();

	}

	public void gui() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		button.addActionListener(this);

		panel.add(button);
		frame.add(panel);
		frame.pack();

	}

	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		panel.remove(l1);
		panel.remove(l2);
		panel.remove(l3);

		int rand1 = new Random().nextInt(3);
		int rand2 = new Random().nextInt(3);
		int rand3 = new Random().nextInt(3);
		// set 1 = orange
		if (rand1 == 0) {
			l1 = loadImageFromComputer(orange);
		}
		if (rand2 == 0) {
			l2 = loadImageFromComputer(orange);
		}
		if (rand3 == 0) {
			l3 = loadImageFromComputer(orange);
		}
		// set2 = pineapple
		if (rand1 == 1) {
			l1 = loadImageFromComputer(pineapple);
		}
		if (rand2 == 1) {
			l2 = loadImageFromComputer(pineapple);
		}
		if (rand3 == 1) {
			l3 = loadImageFromComputer(pineapple);
		}
		// set 3 = cherry
		if (rand1 == 2) {
			l1 = loadImageFromComputer(cherry);
		}
		if (rand2 == 2) {
			l2 = loadImageFromComputer(cherry);
		}
		if (rand3 == 2) {
			l3 = loadImageFromComputer(cherry);
		}

		panel.add(l1);
		panel.add(l2);
		panel.add(l3);

		frame.add(panel);
		frame.pack();

		if ((rand1 == 0 && rand2 == 0 && rand3 == 0) || (rand1 == 1 && rand2 == 1 && rand3 == 1)
				|| (rand1 == 2 && rand2 == 2 && rand3 == 2)) {
			System.out.println("You Win!");
		} else {
			System.out.println("---");
		}

	}

}
