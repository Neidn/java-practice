package Ans200127;

public class Billboard {
	private int rank;
	private int lastweek;
	private String song;
	private String imagesrc;
	private String artist;
	private String artistsrc;

	public Billboard(int rank, String song, int lastweek, String imagesrc, String artist) {
		this.rank = rank;
		this.song = song;
		this.lastweek = lastweek;
		this.imagesrc = imagesrc;
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "[rank=" + rank + ", song=" + song + ", lastweek=" + lastweek + ", imagesrc=" + imagesrc + ", artist="
				+ artist + "]";
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getLastweek() {
		return lastweek;
	}

	public void setLastweek(int lastweek) {
		this.lastweek = lastweek;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public String getImagesrc() {
		return imagesrc;
	}

	public void setImagesrc(String imagesrc) {
		this.imagesrc = imagesrc;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getArtistsrc() {
		return artistsrc;
	}

	public void setArtistsrc(String artistsrc) {
		this.artistsrc = artistsrc;
	}

}
