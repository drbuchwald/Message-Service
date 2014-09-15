
package messageservice;

/**
 *
 * @author Dan
 */
public class Driver {

	public static void main(String[] args) {
		
		Reader freader = new MessageFileReader();
		Writer fwriter = new MessageFileWriter();
                                
                Reader reader = new KeyboardMessageReader();
                Writer writer = new GuiMessageOutput();
                MessageCopier copier = new MessageCopier( reader, writer );
                //Copier copier = new Copier( freader, fwriter );
                copier.copy();
		
                
                copier.setWriter(fwriter);
                copier.writeLine();
                
                Writer cwriter = new ConsoleMessageWriter();
                //copier.setReader(freader);
                copier.setWriter(cwriter);
                copier.writeLine();
//                
                
		// Send end of program message
		System.out.println("copied successfull.");
	}
    
}
