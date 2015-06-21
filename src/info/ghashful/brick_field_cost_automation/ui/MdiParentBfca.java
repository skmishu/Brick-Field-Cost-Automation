/**
 * contins ui 
 */
package info.ghashful.brick_field_cost_automation.ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * 
 Main.java is written for Entry Point Of the application
 *
 * @version 1.0 20th June 2015 * @author Shekhar Ullah
 */
public class MdiParentBfca extends JFrame{

	/**
	 * variables
	 */
	private JDesktopPane theDesktop;
	public MdiParentBfca() {
		super( "Title Changed For Test" );
        JMenuBar bar = new JMenuBar();
        JMenu addMenu = new JMenu( "New" );
        JMenuItem newFrame = new JMenuItem( "internal frame" );
        addMenu.add( newFrame );
        bar.add( addMenu );
        setJMenuBar( bar );
        theDesktop = new JDesktopPane();
        add( theDesktop );       
        newFrame.addActionListener(
           new ActionListener()
           {
              public void actionPerformed( ActionEvent event )
              {
                 JInternalFrame frame = new JInternalFrame(
                    "JInternal Frame", true, true, true, true );
                    JPanel panel = new JPanel();
                    frame.add( panel, BorderLayout.CENTER );
                    frame.pack(); 
                    theDesktop.add( frame );
                    frame.setVisible( true );
                 }
              }
           );
        } 

}
