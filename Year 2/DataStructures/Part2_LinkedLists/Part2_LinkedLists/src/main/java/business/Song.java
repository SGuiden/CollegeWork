package business;

/**
 *
 * @author michelle
 */
package utils;

import java.util.Objects;

/**
 * @author michelle
 */
public class Song {
    private String artist = "Joe Bloggs";
    private String title = "Mmmbop";
    public Song(String Artist, String Title){
        this.artist = Artist;
        this.title = Title;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song song)) return false;
        return Objects.equals(getArtist(), song.getArtist()) && Objects.equals(getTitle(), song.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, title);
    }

    @Override
    public String toString() {
        return "Now Playing - " + title + " by " + artist;
    }

//Implement a class named Song. A Song is made up of two String fields: an artist and a title. Your Song class should
//provide the following functionality:
//1. A default constructor that sets the artist to “Joe Bloggs” and title to “Mmmbop”.
//2. A constructor that takes in two parameters – the artist and the title.
//3. Getter and setter methods for the artist and title.
//4. An equals() method and a hashCode() method – these should base their calculation on the artist and title fields.
//5. A toString() method that returns the artist and title information in a well-formatted manner.


