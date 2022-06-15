import java.io.*;
import multimediaLibrary.*;
import utils.Ser;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
		
		Library lib = new Library("Librairie du coin");
		lib.fill();
		
		Ser.saveXML("lib", lib);
		
		Library test = (Library) Ser.load("lib.xml");
		
		
		System.out.println(test);
//		test.sortAuthor();
//		System.out.println(test);
		
		
		
		test.search();
		
		
		
	}
	
	
	
	
	
}
