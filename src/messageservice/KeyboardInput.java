/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

import java.util.Scanner;

/**
 *
 * @author Dan
 */
public class KeyboardInput implements Reader{
    
    
    public String readln() {
            System.out.println("Enter your message here: ");

            Scanner messageInput = new Scanner(System.in);
            return messageInput.nextLine();
	}
}
