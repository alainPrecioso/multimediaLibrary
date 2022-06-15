package multimediaLibrary;

public class CompactDisk extends Media {
	
	private int tracks;
	
	public CompactDisk() {
		super();
	}
	

	public CompactDisk(String name, String author, String genre, Integer tracks) {
		super(name, author, genre);
		this.tracks = tracks;
		// TODO Auto-generated constructor stub
	}


	public int getTracks() {
		return tracks;
	}


	public void setTracks(int tracks) {
		this.tracks = tracks;
	}


	@Override
	public String toString() {
		return "Compact Disk : " + name + ", " + author + ", " + genre + ", " + tracks +" tracks";
	}
	
	
	
	
	

}
