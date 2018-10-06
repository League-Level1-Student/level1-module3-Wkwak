package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslator implements ActionListener {
	JFrame frame = new JFrame("Pig Latin Translator");
	JPanel panel = new JPanel();
	JButton button = new JButton("translate");
	JTextField tf1 = new JTextField(20);
	JTextField tf2 = new JTextField(20);

	Translator t = new Translator();

	public static void main(String[] args) {
		PigLatinTranslator pl = new PigLatinTranslator();
		pl.gui();

	}

	public void gui() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel.add(tf1);
		panel.add(button);
		panel.add(tf2);

		frame.add(panel);
		frame.pack();

		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		t.translate(tf1.getText());
	}
}
