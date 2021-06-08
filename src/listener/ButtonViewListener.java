package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import GUI.NumberViewer;
import GUI.WindowFrame;

public class ButtonViewListener implements ActionListener {
	WindowFrame frame;
	
	public ButtonViewListener(	WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		NumberViewer viewer = frame.getNumberviewer();
		frame.setupPanel(viewer);	
	}
		
}
