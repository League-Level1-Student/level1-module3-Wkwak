package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	public static void main(String[] args) {
		NastySurprise ns =new NastySurprise();
		ns.ui();
	}
	
	public void ui(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		JButton button2 = new JButton();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		
		button.setText("Trick");
		button2.setText("Treat");
		
		button.addActionListener(this);
		button2.addActionListener(this);
		
		frame.pack();
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Trick")) {
			showPictureFromTheInternet("https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwid8fyX-p3dAhWaCTQIHaCTDnUQjRx6BAgBEAU&url=https%3A%2F%2Fwww.twitch.tv%2Fhsdogdog&psig=AOvVaw15Rxsr3Uck3VCursindEXB&ust=1536033860545615");
		}
		if (e.getActionCommand().equals("Treat")) {
			showPictureFromTheInternet("https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwi3zvmj-p3dAhUZGjQIHdTZAOsQjRx6BAgBEAU&url=https%3A%2F%2Fwww.amazon.com%2FNicolas-Cage-Celebrity-Fancy-Dress%2Fdp%2FB00W5IY1BO&psig=AOvVaw0_5kwSK2r1BV8b4Hsia9XN&ust=1536033886040027");
		}
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}

}
