
package messageservice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Dan
 */
public class FileWriter implements Writer {
    
    public void writeln(String line) {
		boolean append = false;
		File data = new File(File.separatorChar + "Temp" + 
			  File.separatorChar + "datacopy.txt");
		PrintWriter out = null;
			  
		// This is where we setup our streams (append = false means overwrite)
		// new java.io.FileWriter() creates the file if doesn't exit
		try {
			// make sure we differentiate between java.io.FileWriter
			// class and this custom FileWriter class
			out = new PrintWriter(
						new BufferedWriter(
						new java.io.FileWriter(data, append) ) );
			out.println(line);
			out.close();
			
		} catch (IOException ioe) {
			if(out != null) out.close();
			System.out.println( ioe.getMessage() );
			System.exit(1);  // 1 = signals program end with error
		}

	}

}
