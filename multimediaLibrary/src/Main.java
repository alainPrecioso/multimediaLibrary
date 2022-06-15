import multimediaLibrary.*;
import utils.Ser;

public class Main {

	public static void main(String[] args) {

		
//		
//		Library lib = new Library("Librairie du coin");
//		lib.fill();
//		
//		
//		Ser.save("lib", lib);
//		
		Library test = (Library) Ser.load("lib.xml");
		
		String a = test.getLibrary().getClass().getName();
		System.out.println(a);
		
		System.out.println(test);
//		test.sortAuthor();
//		System.out.println(test);
		
		
		
		test.search();
		
		
		
	}
	
	
	
	
	
}
