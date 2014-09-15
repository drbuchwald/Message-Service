
package messageservice;

/**
 *
 * @author Dan
 */
public class ConsoleWriter implements Writer{
    @Override
    public void writeln( String line ) {
            System.out.println("New Message:");
            System.out.println( line );
	}
}
