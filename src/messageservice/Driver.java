
package messageservice;

/**
 *
 * @author Dan
 */
public class Driver {

	public static void main(String[] args) {
		
		Reader freader = new FileReader();
		Writer fwriter = new FileWriter();
                                
                Reader reader = new KeyboardInput();
                Writer writer = new GuiOutput();
                Copier copier = new Copier( reader, writer );
                //Copier copier = new Copier( freader, fwriter );
                copier.copy();
		
                
                copier.setWriter(fwriter);
                copier.writeLine();
                
                Writer cwriter = new ConsoleWriter();
                //copier.setReader(freader);
                copier.setWriter(cwriter);
                copier.writeLine();
//                
                
		// Send end of program message
		System.out.println("copied successfull.");
	}
    
}
