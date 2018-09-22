import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter = generateRandomLetter();
	JPanel panel = new JPanel();
	JLabel jLabel = new JLabel();
	JFrame frame = new JFrame();
	
	char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}
	
	public static void main(String[] args) {
		TypingTutor tt = new TypingTutor();
		tt.frame();
		
	}
	
	public void frame() {
		frame.setVisible(true);
		frame.setTitle("Type or Die");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		jLabel.setText(String.valueOf(currentLetter));
		
		jLabel.setFont(jLabel.getFont().deriveFont(28.0f));
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		
		frame.addKeyListener(this);
		
		panel.add(jLabel);
		frame.add(panel);
		
		frame.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You typed: " + e.getKeyChar());
		
		
		if (e.getKeyChar() == currentLetter) {
			System.out.println("correct");
			panel.setBackground(Color.GREEN);
		}
		if (e.getKeyChar() != currentLetter) {
			panel.setBackground(Color.RED);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		jLabel.setText(String.valueOf(currentLetter));
		
	}
	

	
}
