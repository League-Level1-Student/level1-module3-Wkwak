import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorRunner implements ActionListener {

	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	JLabel label = new JLabel();
	JFrame frame = new JFrame("Simple Calculator");
	JPanel panel = new JPanel();

	public static void main(String[] args) {
		CalculatorRunner calc = new CalculatorRunner();
		calc.graphic();

		Calculator calc2 = new Calculator(0, 0);
	}

	public void graphic() {

		frame.setVisible(true);
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton b1 = new JButton("add");
		JButton b2 = new JButton("subtract");
		JButton b3 = new JButton("multiply");
		JButton b4 = new JButton("divide");

		panel.add(tf1);
		panel.add(tf2);

		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		frame.add(panel);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("add")) {
			int pt1 = Integer.parseInt(tf1.getText());
			int pt2 = Integer.parseInt(tf2.getText());

			int sum = pt1 + pt2;
			String result = Integer.toString(sum);

			label.setText(result);

			panel.add(label);
			frame.add(panel);
		} else if (e.getActionCommand().equals("subtract")) {
			int pt1 = Integer.parseInt(tf1.getText());
			int pt2 = Integer.parseInt(tf2.getText());

			int difference = pt1 - pt2;
			String result = Integer.toString(difference);

			label.setText(result);

			panel.add(label);
			frame.add(panel);
		} else if (e.getActionCommand().equals("divide")) {
			int pt1 = Integer.parseInt(tf1.getText());
			int pt2 = Integer.parseInt(tf2.getText());

			int quotient = pt1 / pt2;
			String result = Integer.toString(quotient);

			label.setText(result);

			panel.add(label);
			frame.add(panel);
		} else if (e.getActionCommand().equals("multiply")) {
			int pt1 = Integer.parseInt(tf1.getText());
			int pt2 = Integer.parseInt(tf2.getText());

			int product = pt1 * pt2;
			String result = Integer.toString(product);

			label.setText(result);

			panel.add(label);
			frame.add(panel);
		}
	}
}
