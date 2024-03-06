package business;

/**
 *
 * @author michelle
 */
import java.util.Objects;
//Implement a class named Song. A Song is made up of two String fields: an artist and a title. Your Song class should
//provide the following functionality:
//1. A default constructor that sets the artist to “Joe Bloggs” and title to “Mmmbop”.
public class Song {
    private String artist = "Joe Bloggs";
    private String title = "Mmmbop";

    //2. A constructor that takes in two parameters – the artist and the title.
    public Song(String Artist, String Title) {
        this.artist = Artist;
        this.title = Title;
    }

    //3. Getter and setter methods for the artist and title.

    /**
     * gets the name of artist
     *
     * @return the artist String
     */
    public String getArtist() {
        return artist;
    }

    /**
     * gets the name of the song
     *
     * @return the title string
     */
    public String getTitle() {
        return title;
    }


    //4. An equals() method and a hashCode() method – these should base their calculation on the artist and title fields.

    /**
     * @param o object to check
     * @return a boolean indicating either the object
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true
        }
        if (!(o instanceof Song song)) {
            return false
        }
        return Objects.equals(getArtist(), song.getArtist()) && Objects.equals(getTitle(), song.getTitle());
    }

    /**
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(artist, title);
    }

    //5. A toString() method that returns the artist and title information in a well-formatted manner.

    @Override
    /**
     * @return a String containing the title and artist in a user friendly manner
     */
    public String toString() {
        return "Now Playing - " + title + " by " + artist;
    }

}
