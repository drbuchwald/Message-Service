/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

/**
 *
 * @author Dan
 */
public class Driver {

	public static void main(String[] args) {
		
		FileReader reader = new FileReader();
                Writer writer = new FileWriter();
                
                Copier copier = new Copier( reader, writer );
		copier.copy();
		
		// Send end of program message
		System.out.println("Program ended. Line of reader input copied successfully to writer output.");
	}
    
}
