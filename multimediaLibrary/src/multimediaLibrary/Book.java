package multimediaLibrary;

@SuppressWarnings(value = { "serial" }) 
public class Book extends Media {
	private String type;
	
	
	public Book() {
		
	}

	public Book(String name, String author, String genre, String type) {
		super(name, author, genre);
		this.type = type;
	}
	
	public Book(Boolean familyName, String name, String author, String genre, String type) {
		super(familyName, name, author, genre);
		this.type = type;
	}

	public String toString() {
		return "Book : " + name + ", " + author + ", " + type + ", " + genre;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	void empty() {
		
	}
	
	
	
}
