package multimediaLibrary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Library implements Serializable {
	
	static ArrayList<Media> library = new ArrayList<Media>();
	String name;
	
	
	
	public Library(String name) {
		this.name = name;
	}
	
	


	public void addToLibrary(Media media) {
		Library.library.add(media);
	}
	
	public String toString() {
		String mediaString = "Name, Author, Type, Genre\n";
		for (Media media : library) {
			mediaString += media + "\n";
		}
		return mediaString;
	}
	
	public static void search() {
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
	
	public static void searchName() {
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
	
	public static void searchAuthor() {
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
	
	public static void searchGenre() {
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
	
	public static void searchType() {
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
	
	

	public void inventory() {
		
	}




	public Media get(int i) {
		
		return library.get(i);
	}
	
	
	
}
