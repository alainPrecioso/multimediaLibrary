import multimediaLibrary.*;
import utils.Ser;
import utils.FrameWin;

public class Main {

	public static void main(String[] args) {

		

		Library test = (Library) Ser.load("lib.xml");
		
		
		test.searchScan();
		
		
	}
	
	
	public Library makeLibrary(){
		Library lib = new Library("Librairie du coin");
		lib.fill();
		Ser.save("lib", lib);
		return lib;
	}
	
	
	
	
}
