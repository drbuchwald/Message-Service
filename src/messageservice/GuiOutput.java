
package messageservice;

import javax.swing.JOptionPane;

/**
 *
 * @author Dan
 */
public class GuiOutput implements Writer {
	
	
        @Override
	public void writeln( String line ) {
            JOptionPane.showMessageDialog(null, line);
	}
}
