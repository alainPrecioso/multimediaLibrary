package multimediaLibrary;

import java.io.Serializable;
@SuppressWarnings(value = { "serial" }) 
public abstract class Media implements Serializable {
	//attributes or fields
	protected String name; //
	protected String author;
	protected String genre;
	protected Boolean familyName;
	

	public Media() {
		
	}
	
	public Media(Boolean familyName, String name, String author, String genre) {
		this.familyName = familyName;
		this.name = name;
		this.author = author;
		this.genre = genre;
	}
	
	public Media(String name, String author, String genre) {
		this.familyName = false;
		this.name = name;
		this.author = author;
		this.genre = genre;
	}
	

	public Boolean getFamilyName() {
		return familyName;
	}

	public void setFamilyName(Boolean familyName) {
		this.familyName = familyName;
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
	
	public String getAuthorName() {
		if (getFamilyName() == true) {
			return author.substring(author.lastIndexOf(' ')+1);
		}
		return author;
		
	}
	
}



