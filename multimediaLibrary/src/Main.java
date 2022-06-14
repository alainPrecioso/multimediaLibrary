
import java.io.*;

import multimediaLibrary.*;
import utils.Serializer;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
		
		Library lib = new Library("Librairie du coin");
		lib.fill();
		
		Serializer.save("lib", lib);
		
		
		
		
		Library libSerial = (Library) Serializer.load("lib.ser");
		
		
		
		lib.search();
		
		
		
	}
	
	
	
	
	
}
