package info.ghashful.brick_field_cost_automation.ui;

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
		MdiParentBfca desktopFrame = new MdiParentBfca();
        desktopFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        desktopFrame.setSize( 600, 480 );
        desktopFrame.setVisible( true );
	}

}
