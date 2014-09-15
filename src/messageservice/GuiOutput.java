/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

import javax.swing.JOptionPane;

/**
 *
 * @author Dan
 */
public class GuiOutput implements Writer {
	
	/**
	 * Write a line of text to a GUI Window.
	 * 
	 * @param line - a String representing one line of text.
	 * @see Writer#writeln()
	 */
        @Override
	public void writeln( String line ) {
            JOptionPane.showMessageDialog(null, line);
	}
}
