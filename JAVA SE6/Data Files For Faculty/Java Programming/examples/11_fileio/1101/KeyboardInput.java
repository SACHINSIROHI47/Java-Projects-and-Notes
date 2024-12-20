import java.io.*;

public class KeyboardInput {
	public static void main (String[] args) {
		String s;
		// Create a buffered reader to read
		// each line from the keyboard.
		InputStreamReader ir
					= new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		System.out.println("Unix: Type ctrl-d to exit." +
			"\nWindows: Type ctrl-z to exit");
		try {
			// Read each input line and echo it
			s = in.readLine();
			while ( s != null ) {
				System.out.println("Read: " + s);
				s = in.readLine();
			}
            while ( (s = in.readLine()) != null ) {
	            System.out.println("Read: " + s);
            }

    		// Close the buffered reader.
			in.close();
   		} catch (IOException e) { // Catch any exceptions.
			e.printStackTrace();
		}
	}
}