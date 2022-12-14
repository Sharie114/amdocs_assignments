package assignment.day8.playlist;

public class Song {
	private String name, artist;

	public Song(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String toString() {
		return "Title: " + getName() + ", Artist: " + getArtist();
	}
	
	

}
