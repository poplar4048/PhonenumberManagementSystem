package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.ButtonAddListener;
import listener.ButtonViewListener;

public class MenuSelection extends JPanel {
	
	WindowFrame frame;

	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Nenu Selection");
		
		JButton button1 = new JButton("Add number");
		JButton button2 = new JButton("View number");
		JButton button3 = new JButton("Edit number");
		JButton button4 = new JButton("Delete number");
		JButton button5 = new JButton("EXIT");
		
		button1.addActionListener(new ButtonAddListener(frame));
		button2.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label);
		panel2.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);

		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
	}
	
}
