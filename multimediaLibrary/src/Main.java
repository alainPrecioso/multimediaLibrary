
import java.io.*;

import multimediaLibrary.*;
import utils.Serializer;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Book lotr = new Book("Lord of the Rings", "Tolkien", "Fantasy", "Fiction");
		Book dune = new Book("Dune", "Herbert", "Scifi", "Fiction");
		Book foundation = new Book("Foundation", "Asimov", "Scifi", "Fiction");
		Book ringworld = new Book("Ringworld", "Larry Niven", "Scifi", "Fiction");
		Book kapital = new Book("Capital: A Critique of Political Economy", "Marx", "Economy", "Non-Fiction");
		Book distinction = new Book("Distinction: A Social Critique of the Judgement of Taste", "Bourdieu", "Sociology", "Non-Fiction");
		Book deuxiemeSexe = new Book("The Second Sex", "Simonne de Beauvoir", "Philosophy", "Non-Fiction");
		//System.out.println(lotr);
		
		Library lib = new Library("Librairie du coin");
			
		lib.addToLibrary(lotr);
		lib.addToLibrary(dune);
		lib.addToLibrary(foundation);
		lib.addToLibrary(ringworld);
		lib.addToLibrary(kapital);
		lib.addToLibrary(distinction);
		lib.addToLibrary(deuxiemeSexe);
		
		
		
		
		//Book lotrSerial = (Book) Serializer.load("lotr.ser");
		//System.out.println(lotrSerial);
		
		
		Library libSerial = (Library) Serializer.load("lib.ser");
		System.out.println(libSerial);
		
		
		Media libGet = libSerial.get(0);
		System.out.println(libGet);
		
		Library.search();
		
		
		Book test = (Book) Serializer.load("dune.ser");
		System.out.println(test);
		
	}
	
	
	
	
	
}
