package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {
	
	MenuSelection menuselection;
	NumberAdder numberadder;
	NumberViewer numberviewer;
			
	public WindowFrame() {	
		this.menuselection = new MenuSelection(this);
		this.numberadder = new NumberAdder(this);
		this.numberviewer = new NumberViewer(this);
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//this.add(menuselection);
		//this.add(numberadder);
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public NumberAdder getNumberadder() {
		return numberadder;
	}

	public void setNumberadder(NumberAdder numberadder) {
		this.numberadder = numberadder;
	}

	public NumberViewer getNumberviewer() {
		return numberviewer;
	}

	public void setNumberviewer(NumberViewer numberviewer) {
		this.numberviewer = numberviewer;
	}

}
