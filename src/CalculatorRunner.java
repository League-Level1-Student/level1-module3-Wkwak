import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorRunner {
	public static void main(String[] args) {
		CalculatorRunner calc = new CalculatorRunner();
		calc.graphic();

		Calculator calc2 = new Calculator(0, 0);
	}

	public void graphic() {
		JFrame frame = new JFrame("Simple Calculator");
		frame.setVisible(true);
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		JButton b1 = new JButton("add");
		JButton b2 = new JButton("subtract");
		JButton b3 = new JButton("multiply");
		JButton b4 = new JButton("divide");

		JTextField tf1 = new JTextField(10);
		JTextField tf2 = new JTextField(10);

		panel.add(tf1);
		panel.add(tf2);
		String i1 = tf1.getText();
		String i2 = tf1.getText();

		int input1 = Integer.parseInt(i1);
		int input2 = Integer.parseInt(i2);

		JLabel label = new JLabel();

		label.add(b1);
		label.add(b2);
		label.add(b3);
		label.add(b4);

		frame.add(panel);
		frame.pack();
	}
}
