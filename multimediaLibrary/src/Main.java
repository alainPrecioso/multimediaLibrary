
import java.io.*;

import multimediaLibrary.*;
import utils.Ser;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
		
		Library lib = new Library("Librairie du coin");
		lib.fill();
		
		
		Library test = (Library) Ser.loadXML("lib.xml");
		
		
		
		System.out.println(test);
		
		
		
		
		
		
		
		//lib.search();
		
		
		
	}
	
	
	
	
	
}
