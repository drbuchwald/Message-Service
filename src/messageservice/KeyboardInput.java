
package messageservice;

import java.util.Scanner;

/**
 *
 * @author Dan
 */
public class KeyboardInput implements Reader{
    
    
   
    @Override
    public String readln() {
            System.out.println("Enter your message here: ");

            Scanner messageInput = new Scanner(System.in);
            return messageInput.nextLine();
	}
}
