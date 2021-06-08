package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class NumberAdder extends JPanel {
	
	WindowFrame frame;

	public NumberAdder(WindowFrame frame) {
		this.frame = frame;

		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelNumber = new JLabel("Number: ", JLabel.TRAILING);
		JTextField fieldNumber = new JTextField(10);
		labelNumber.setLabelFor(fieldNumber);
		panel.add(labelNumber); 
		panel.add(fieldNumber);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName); 
		panel.add(fieldName);
		
		JLabel labelAdress = new JLabel("Adress: ", JLabel.TRAILING);
		JTextField fieldAdress = new JTextField(10);
		labelAdress.setLabelFor(fieldAdress);
		panel.add(labelAdress);
		panel.add(fieldAdress);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);		
	}

}
