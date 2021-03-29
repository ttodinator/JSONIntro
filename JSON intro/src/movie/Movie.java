package movie;

import com.google.gson.annotations.SerializedName;

public class Movie {
	
	@SerializedName("id")
	private String imdbId;
	private String title;
	
	@SerializedName("year")
	private int releaseYeas;
	
	
	private transient double rating;
	
	public String getImdbId() {
		return imdbId;
	}
	
	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getReleaseYeas() {
		return releaseYeas;
	}
	
	public void setReleaseYeas(int releaseYeas) {
		this.releaseYeas = releaseYeas;
	}
	
	public double getRating() {
		return rating;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [imdbId=" + imdbId + ", title=" + title + ", releaseYeas=" + releaseYeas + ", rating=" + rating
				+ "]";
	}
	
	
	
	

}
