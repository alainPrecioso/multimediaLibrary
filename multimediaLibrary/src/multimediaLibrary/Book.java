package multimediaLibrary;


public class Book extends Media {
	protected String type;
	
	
	public Book() {
		
	}

	public Book(String name, String author, String genre, String type) {
		super(name, author, genre);
		this.type = type;
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String media  = name + ", " + author + ", " + type + ", " + genre;
		return media;
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
