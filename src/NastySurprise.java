
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Trick")) {
			showPictureFromTheInternet("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdAOOAmsN7O1T5So0hPiyF81iBO3daVU4WHPCr6fv2YrNJx4PxOQ");
		}
		if (e.getActionCommand().equals("Treat")) {
			showPictureFromTheInternet("https://images-na.ssl-images-amazon.com/images/I/61Wo915nuTL._SX425_.jpg");
		}

	}

}
