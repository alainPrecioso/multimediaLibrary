package multimediaLibrary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import utils.AuthorComparator;
import utils.ClassComparator;
import utils.NameComparator;
@SuppressWarnings(value = { "serial" }) 
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
	
	public ArrayList<Media> search(String input, String search) {
		ArrayList<Media> list = new ArrayList<Media>();
		switch (input) {
		case "N" :
			searchName(search, list);
			return list;
		case "A" :
			searchAuthor(search, list);
			return list;
		case "G" :
			searchGenre(search, list);
			return list;
		case "T" :
			searchType(search, list);
			return list;
		}
		return list;
		
	}
	
	public void searchScan() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What are you searching?\n(N)ame\n(A)uthor\n(G)enre\n(T)ype");
		ArrayList<Media> list = new ArrayList<Media>();
		switch (scan.next().toUpperCase()) {
		case "N" :
			searchNameScan(list);
			break;
		case "A" :
			searchAuthorScan(list);
			break;
		case "G" :
			searchGenreScan(list);
			break;
		case "T" :
			searchTypeScan(list);
			break;
		}
		scan.close();
		
		for (Media media : list) {
			System.out.println(media);
		}
		
	}
	
	
	public ArrayList<Media> searchName(String name, ArrayList<Media> list) {
		for (Media media : library) {
			if (media.getName().toLowerCase().contains(name.toLowerCase()) ) {
				list.add(media);
			}
		}
		return list;
	}
	
	public ArrayList<Media> searchNameScan(ArrayList<Media> list) {
		Scanner scan = new Scanner(System.in);
		//String attribute = scan.next();
		System.out.println("What name are you searching?");
		searchName(scan.next(), list);
		scan.close();
		return list;
	}
	
	public ArrayList<Media> searchAuthor(String author, ArrayList<Media> list) {
		for (Media media : library) {
			if (media.getAuthor().toLowerCase().contains(author.toLowerCase()) ) {
				list.add(media);
			}
		}
		return list;
	}
	
	public ArrayList<Media> searchAuthorScan(ArrayList<Media> list) {
		Scanner scan = new Scanner(System.in);
		//String attribute = scan.next();
		System.out.println("What name are you searching?");
		searchAuthor(scan.next(), list);
		scan.close();
		return list;
	}
	
	public ArrayList<Media> searchGenre(String genre, ArrayList<Media> list) {
		for (Media media : library) {
			if (media.getGenre().equals(genre) ) {
				list.add(media);
			}
		}
		return list;
	}
	
	public ArrayList<Media> searchGenreScan(ArrayList<Media> list) {
		Scanner scan = new Scanner(System.in);
		//String attribute = scan.next();
		System.out.println("What genre are you searching?");
		searchGenre(scan.next(), list);
		scan.close();
		return list;
	}
	
	public ArrayList<Media> searchType(String type, ArrayList<Media> list) {
		switch (type) {
			case "F":
				type = "Fiction";
				break;
			case "N":
				type = "Non-fiction";
				break;
		}
		for (Media media : library) {
			if (media.getType().equals(type) ) {
				list.add(media);
			}
		}
		return list;
	}
	
	public ArrayList<Media> searchTypeScan(ArrayList<Media> list) {
		Scanner scan = new Scanner(System.in);
		//String attribute = scan.next();
		System.out.println("What type are you searching?\n(F)iction\n(N)on-fiction");
		searchType(scan.next(), list);
		scan.close();
		return list;
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
		library.add(new CompactDisk(true, "Thriller" , "Michael Jackson" , "Pop" , "42:16", 1982));
		library.add(new CompactDisk("Back in Black" , "AC/DC" , "Hard Rock" , "42:11", 1980));
		library.add(new CompactDisk("The Dark Side of the Moon" , "Pink Floyd" , "Progressive Rock" , "43:09", 1973 ));
		library.add(new CompactDisk("Led Zeppelin IV" , "Led Zeppelin" , "Hard Rock" , "42:20", 1971));
		library.add(new Book(true, "Ringworld", "Larry Niven", "Scifi", "Fiction"));
		library.add(new Book(true, "Capital: A Critique of Political Economy", "Karl Marx", "Economy", "Non-Fiction"));
		library.add(new Book(true, "The Hobbit", "J.R.R. Tolkien", "Fantasy", "Fiction"));
		library.add(new Book(true, "Distinction: A Social Critique of the Judgement of Taste", "Pierre Bourdieu", "Sociology", "Non-Fiction"));
		library.add(new Book(true, "The Second Sex", "Simone de Beauvoir", "Philosophy", "Non-Fiction"));
		
		
		
		Collections.sort(library, new ClassComparator());
	}


	public Media get(int i) {
		
		return library.get(i);
	}
}
