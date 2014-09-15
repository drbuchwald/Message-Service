
package messageservice;

/**
 *
 * @author Dan
 */
public class Copier {
    private Reader reader;
	private Writer writer;
        private String line;
	
	
	
    public Copier( Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }
		
	public void copy() {
            line = reader.readln();
            writer.writeln( line );
	}
        
        
        public void readLine(){
            line = reader.readln();
        }
        
        public void writeLine(){
            writer.writeln(line);
        }
        
public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
  }
