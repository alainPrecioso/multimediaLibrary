package multimediaLibrary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import utils.AuthorComparator;
import utils.ClassComparator;
import utils.NameComparator;

public class Library implements Serializable {
	
	private ArrayList<Media> library = new ArrayList<Media>();
	private String name;
	
	
	public ArrayList<Media> getLibrary() {
		return library;
	}


	public void setLibrary(ArrayList<Media> library) {
		this.library = library;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Library() {
		
	}
	
	
	public Library(String name) {
		this.name = name;
	}
	
	


	public void addToLibrary(Media media) {
		library.add(media);
	}
	
	public String toString() {
		System.out.println(name);
		String mediaString = "Media : Name, Author, Type, Genre\n";
		for (Media media : library) {
			mediaString += media + "\n";
		}
		return mediaString;
	}
	
	public void search() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What are you searching?\n(N)ame\n(A)uthor\n(G)enre\n(T)ype");
		String input = scan.next().toUpperCase();
		switch (input) {
		case "N" :
			searchName();
			break;
		case "A" :
			searchAuthor();
			break;
		case "G" :
			searchGenre();
			break;
		case "T" :
			searchType();
			break;
		}
		
	}
	
	
	public void searchName() {
		Scanner scan = new Scanner(System.in);
		//String attribute = scan.next();
		System.out.println("What name are you searching?");
		String variable = scan.next();
		
		
		for (Media media : library) {
			if (media.getName().toLowerCase().contains(variable.toLowerCase()) ) {
				System.out.println(media);
			}
		}
	}
	
	public void searchAuthor() {
		Scanner scan = new Scanner(System.in);
		//String attribute = scan.next();
		System.out.println("What name are you searching?");
		String variable = scan.next();
		
		
		for (Media media : library) {
			if (media.getAuthor().toLowerCase().contains(variable.toLowerCase()) ) {
				System.out.println(media);
			}
		}
	}
	
	public void searchGenre() {
		Scanner scan = new Scanner(System.in);
		//String attribute = scan.next();
		System.out.println("What genre are you searching?");
		String variable = scan.next();
		
		
		for (Media media : library) {
			if (media.getGenre().equals(variable) ) {
				System.out.println(media);
			}
		}
	}
	
	public void searchType() {
		Scanner scan = new Scanner(System.in);
		//String attribute = scan.next();
		System.out.println("What type are you searching?\n(F)iction\n(N)on-fiction");
		String variable = scan.next();
		switch (variable) {
			case "F":
				variable = "Fiction";
				break;
			case "N":
				variable = "Non-fiction";
				break;
		}
		for (Media media : library) {
			if (media.getType().equals(variable) ) {
				System.out.println(media);
			}
		}
	}
	public void sort() {
		Collections.sort(library, new ClassComparator());
	}
	
	public void sortName() {
		Collections.sort(library, new NameComparator());
	}
	
	public void sortAuthor() {
		Collections.sort(library, new AuthorComparator());
	}

	public void fill() {
		library.add(new Book(true, "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", "Fiction"));
		library.add(new Book(true, "Dune", "Frank Herbert", "Scifi", "Fiction"));
		library.add(new Book(true, "Foundation", "Isaac Asimov", "Scifi", "Fiction"));
		library.add(new Book(true, "Ringworld", "Larry Niven", "Scifi", "Fiction"));
		library.add(new Book(true, "Capital: A Critique of Political Economy", "Karl Marx", "Economy", "Non-Fiction"));
		library.add(new Book(true, "The Hobbit", "J.R.R. Tolkien", "Fantasy", "Fiction"));
		library.add(new Book(true, "Distinction: A Social Critique of the Judgement of Taste", "Pierre Bourdieu", "Sociology", "Non-Fiction"));
		library.add(new Book(true, "The Second Sex", "Simone de Beauvoir", "Philosophy", "Non-Fiction"));
		library.add(new CompactDisk(true, "Thriller" , "Michael Jackson" , "Pop" , "42:16", 1982));
		library.add(new CompactDisk("Back in Black" , "AC/DC" , "Hard Rock" , "42:11", 1980));
		library.add(new CompactDisk("The Dark Side of the Moon" , "Pink Floyd" , "Progressive Rock" , "43:09", 1973 ));
		library.add(new CompactDisk("Led Zeppelin IV" , "Led Zeppelin" , "Hard Rock" , "42:20", 1971));
		
		
		Collections.sort(library, new ClassComparator());
	}




	public Media get(int i) {
		
		return library.get(i);
	}
	
	
	
}
