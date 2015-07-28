package src.info.ghashful.brick_field_cost_automation.ui;

import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * 
 Main.java is written for Entry Point Of the application
 *
 * @version 1.0 20th June 2015 * @author Shekhar Ullah
 */
public class Main{

	public Main() {
		
	}

	public static void main(String[] args) {
		
		LoginClass desktopMainFrame = new LoginClass();
		desktopMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		desktopMainFrame.setSize(450,350);
		desktopMainFrame.setVisible(true);
		
		/* Old mdi frame code
		MdiParentBfca desktopFrame = new MdiParentBfca();
        desktopFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        desktopFrame.setSize( Toolkit.getDefaultToolkit().getScreenSize());
        desktopFrame.setVisible( true );
        */
	}

}
