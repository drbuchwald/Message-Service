
package messageservice;

import javax.swing.JOptionPane;

/**
 *
 * @author Dan
 */
public class GuiMessageOutput implements Writer {
	
	
        
        @Override
	public void writeln( String line ) {
            JOptionPane.showMessageDialog(null, line);
	}
}
