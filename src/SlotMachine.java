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
		
		
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
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
		int rand = new Random().nextInt(3);
		
		l1 = loadImageFromComputer();
		l2 = loadImageFromComputer();
		l3 = loadImageFromComputer();
		
	}

}
