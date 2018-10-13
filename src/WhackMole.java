import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class WhackMole implements ActionListener {
	JFrame frame = new JFrame("Whack a Button for Fame and Glory");
	JPanel panel = new JPanel();
	int counter;
	int miss;
	
	public static void main(String[] args) {
		WhackMole mole = new WhackMole();
		int rand = new Random().nextInt(24);
		mole.drawButtons(rand);
		
	}
	
	public void drawButtons(int rand) {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 400);
		JButton button = new JButton();
		
		for (int i = 0; i < 24; i++) {
			button.setText("" + i);
			panel.add(button);
			button.addActionListener(this);
		}
		frame.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (!e.getActionCommand().equals("mole!")) {
			speak("incorrect");
			frame.dispose();
			counter++;
		}
		else if (e.getActionCommand().equals("mole!")) {
			playSound("415510__inspectorj__bell-counter-a");
			miss++;
		}
	}
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}


}
