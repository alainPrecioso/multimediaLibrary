package multimediaLibrary;
@SuppressWarnings(value = { "serial" }) 
public class CompactDisk extends Media {
	
	private String length;
	private Integer releaseYear;
	
	public CompactDisk() {
		super();
	}
	

	public CompactDisk(String name, String author, String genre, String length, Integer releaseYear) {
		super(name, author, genre);
		this.length = length;
		this.releaseYear = releaseYear;
		// TODO Auto-generated constructor stub
	}
	
	public CompactDisk(Boolean familyName, String name, String author, String genre, String length, Integer releaseYear) {
		super(familyName, name, author, genre);
		this.length = length;
		this.releaseYear = releaseYear;
		// TODO Auto-generated constructor stub
	}


	public Integer getReleaseYear() {
		return releaseYear;
	}


	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}


	public String getLength() {
		return length;
	}


	public void setLength(String length) {
		this.length = length;
	}


	@Override
	public String toString() {
		return "Compact Disk : " + name + ", " + author + ", " + genre + ", " + releaseYear + ", " + length;
	}
	
	
	
	
	

}
