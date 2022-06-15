package multimediaLibrary;

public class CompactDisk extends Media {
	
	private String length;
	private int releaseYear;
	
	public CompactDisk() {
		super();
	}
	

	public CompactDisk(String name, String author, String genre, String length, Integer releaseYear) {
		super(name, author, genre);
		this.length = length;
		this.releaseYear = releaseYear;
		// TODO Auto-generated constructor stub
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
