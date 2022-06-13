package multimediaLibrary;

import java.io.Serializable;

public abstract class Media implements Serializable {
	//attributes or fields
	protected String name; //
	protected String author;
	protected String genre;
	
	public Media() {
		
	}
	
	public Media(String name, String author, String genre) {
		this.name = name;
		this.author = author;
		this.genre = genre;
	}
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getType() {
		return author;
	}


	public void setType(String type) {
		this.author = type;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}
}



