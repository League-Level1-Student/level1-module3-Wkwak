import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class WhackMole implements ActionListener {
	JFrame frame = new JFrame("Whack a Button for Fame and Glory");
	JPanel panel = new JPanel(); 
	static Date date = new Date();
	static int rand = new Random().nextInt(24);
	int counter;
	int miss;
	
	public static void main(String[] args) {

		WhackMole mole = new WhackMole();
		mole.drawButtons(rand);
		
	
	}
	
	public void drawButtons(int random) {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 400);
		
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			button.setText("");
			panel.add(button);
			button.addActionListener(this);
			
			if (i==random) {
				JButton button2 = new JButton();
				button.setText("mole!");
				panel.add(button);
				button2.addActionListener(this);
			}
		}
		frame.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("mole!")) {
			playSound("339822__inspectorj__hand-bells-cluster.wav");
			counter++;
			frame.dispose();
		
			drawButtons(rand);
			if (counter == 10) {
				endGame(date, 10);
			}
			
		}
		
		else {
			speak("incorrect");
			frame.dispose();
			miss++;
			drawButtons(rand);
			frame.add(panel);
			if (miss == 1) {
				JOptionPane.showMessageDialog(null, "You missed");
			}
			else if (miss == 2) {
				JOptionPane.showMessageDialog(null, "Whoops");
			}
			else if (miss == 3) {
				JOptionPane.showMessageDialog(null, "Keep on trying");
			}
			else if (miss == 4) {
				JOptionPane.showMessageDialog(null, "1 more miss and you lose");
			}
			else if (miss == 5) {
				JOptionPane.showMessageDialog(null, "You lost");
				System.exit(0);
			}
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
