package multimediaLibrary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Library implements Serializable {
	
	static ArrayList<Media> library = new ArrayList<Media>();
	String name;
	
	
	public Library() {
		
	}
	
	
	public Library(String name) {
		this.name = name;
	}
	
	


	public void addToLibrary(Media media) {
		library.add(media);
	}
	
	public String toString() {
		String mediaString = "Name, Author, Type, Genre\n";
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
	
	

	public void fill() {
		Book lotr = new Book("Lord of the Rings", "Tolkien", "Fantasy", "Fiction");
		Book dune = new Book("Dune", "Herbert", "Scifi", "Fiction");
		Book foundation = new Book("Foundation", "Asimov", "Scifi", "Fiction");
		Book ringworld = new Book("Ringworld", "Larry Niven", "Scifi", "Fiction");
		Book kapital = new Book("Capital: A Critique of Political Economy", "Marx", "Economy", "Non-Fiction");
		Book distinction = new Book("Distinction: A Social Critique of the Judgement of Taste", "Bourdieu", "Sociology", "Non-Fiction");
		Book deuxiemeSexe = new Book("The Second Sex", "Simone de Beauvoir", "Philosophy", "Non-Fiction");
		
		library.add(lotr);
		library.add(dune);
		library.add(foundation);
		library.add(ringworld);
		library.add(kapital);
		library.add(distinction);
		library.add(deuxiemeSexe);
	}




	public Media get(int i) {
		
		return library.get(i);
	}
	
	
	
}
