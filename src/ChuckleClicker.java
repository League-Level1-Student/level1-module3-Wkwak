import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {
		ChuckleClicker cc = new ChuckleClicker();
		cc.makeButtons();
	}
	
	public void makeButtons(){
		JOptionPane.showMessageDialog(null, "Make Buttons");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JButton b1 = new JButton("joke");
		JButton b2 = new JButton("punchline");
		
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		frame.pack();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("joke")) {
			JOptionPane.showMessageDialog(null, "Why can't you trust an atom");
		}
		if (e.getActionCommand().equals("punchline")) {
			JOptionPane.showMessageDialog(null, "because they make up everything");
		}
	}
}
