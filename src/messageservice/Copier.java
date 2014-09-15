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
public class Copier {
    private Reader reader;
	private Writer writer;
	
	
	public Copier( Reader reader, Writer writer ) {
		this.reader = reader;
		this.writer = writer;
	}
		
	public void copy() {
            String line = reader.readln();
            writer.writeln( line );
	}

  }
