import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SlotMachine {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame("Slot Machine");
	JButton button = new JButton("Spin");
	
	public static void main(String[] args) {
		SlotMachine sm = new SlotMachine();
		sm.gui();
		
	}
	
	public void gui() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		panel.add(button);
		frame.add(panel);
		frame.pack();
	}
}
