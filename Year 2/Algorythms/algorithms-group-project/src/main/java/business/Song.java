package business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Song {
    private String title;
    private String artist;
    private String album;
    private double rating;
    private String genre;
    private String[] tags;
    private int tagCount;

    public Song(String title, String artist, String album, double rating, String genre, String[] tags) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.rating = rating;
        this.genre = genre;
        this.tags = tags;
        this.tagCount = tags.length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String[] getTags() {
        return tags;
    }

    // You may not add the setTags method

    public int getTagCount() {
        return tagCount;
    }

    public void setTagCount(int tagCount) {
        this.tagCount = tagCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(title, song.title) && Objects.equals(artist, song.artist) && Objects.equals(album, song.album);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, album);
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", tags=" + Arrays.toString(tags) +
                ", tagCount=" + tagCount +
                '}';
    }

    /**
     * to add a tag to the tags array
     *
     * @param tag a tag to add to the current tags array
     * @return depending on if the tags have been added or not, it will return true ir false
     */
    public boolean addTag(String tag) {
        //if the array is empty it will add the tag to the first slot.
        if (this.tags.length == 0) {
            String[] addedTags = {tag};

            //will rewrite the original array with the new array and passes the method
            this.tags = addedTags;
            return true;
        } else {
            boolean check = find(tag, this.tags);
            //if the tag isnt in the array it will create a new array with an extra slot.
            if (!check) {
                String[] addedTags = new String[tags.length + 1];

                //adds the tag to the end on the array
                addedTags[addedTags.length - 1] = tag;

                //adds every other value in the tags
                for (int i = 0; i < addedTags.length - 2; i++) {
                    addedTags[i] = tags[i];
                }

                //replaces the original tags array with the new added array
                this.tags = addedTags;

                //returns true as it has completed with an array with the added tag
                return true;
            }

            //if it passes the check there is no need to add to the array.
            return false;
        }

    }

    /**
     * to remove a tag in the tags array
     *
     * @param tag a string to search for in the tags array
     * @return a boolean representing weither it worked (true) or didnt (false)
     */
    public boolean removeTag(String tag) {
        //tracker to increase when a tag is found
        int tracker = 0;

        //the removed tags, assuming that a tag doesnt exist twice is made to contain the array the will eventually replace the original tags array
        String[] removedTags = new String[tags.length - 1];

        //if the tag is in the array
        if (find(tag, this.tags)) {

            //loop through the array to add the data to the removedTags array
            for (int i = 0; i < tagCount; i++) {

                //will only add to the tracker when it finds the tag, skipping the tag when adding data over to the removedTags
                if (tag.equalsIgnoreCase(tags[i])) {
                    tracker++;
                }

                //adding the tags into the array
                removedTags[i] = tags[i + tracker];

                //rewriting the original array to the new  removedTags array
                this.tags = removedTags;
            }
            //when complete it returns true
            return true;
        } else {

            //wil return false as it didnt contain the tag
            return false;
        }
    }

    /**
     * checks if the tag exists using binary search
     * @param tag a tag to search for
     * @return a boolean will return when it has been completed
     */
    public boolean containsTag(String tag) {
        boolean check = false;
        int start = 0;
        int end = tags.length - 1;
        do {
            int midpoint = start+end/2;
            if(tags[midpoint].equalsIgnoreCase(tag)){
                check = true;
            } else if (tags[midpoint].compareToIgnoreCase(tag)<0){
                start = midpoint+1;
            }
            else {
                end = midpoint -1;
            }
        } while (end > start);
        return check;
    }

    /**
     * to display for the user
     *
     * @return returns a user friendly display of the song and its information
     */
    public String formatForDisplay() {
        //if the tags dont exist
        if (tags.length == 0) {

            //no worries heres everything else:)
            String display = "Artist: " + artist + ", Song: " + title + ", Album: " + album + ", Genre: " + genre + ", Rating: " + rating;
            //returns the information without tags
            return display;
        } else {
            //sets the same display as before with an ending to include tags
            String display = "Artist: " + artist + ", Song: " + title + ", Album: " + album + ", Genre: " + genre + ", Rating: " + rating + ", Related Tags";
            for (int i = 0; i < tags.length - 1; i++) {
                //adds the next tag to the end of the display information,
                //and overwrites display with this update, this will continue until it has finished all the tags
                display = display + " - " + tags[i];
            }
            //returns the information with tags
            return display;
        }
    }

    /**
     * to find a String value in a String Array
     *
     * @param value a String to search for in a String Array, in our case it is the tag you want to find in the tags array
     * @param Array a string array to search through, in this instance its our tags array.
     * @return will return a true if the value is found and a false if isnt
     */
    public boolean find(String value, String[] Array) {
        boolean check = false;
        for (int i = 0; i < Array.length - 1; i++) {
            if (Array[i].equalsIgnoreCase(value)) {
                check = true;
                break;
            }
        }
        return check;
    }

    /**
     * to sort an array
     * @return returned the sorted array
     */
    public String[] sortAac() {
        int n = this.tags.length;

        for (int i = 0; i < n - 1; i++) {
            for (int o = 0; o < n - 1 - i; o++) {

                //Compare the two strings, if the first is lexiconically lesser than the second,
                //it will swap them and if not it will leave it

                if (tags[o].compareToIgnoreCase(tags[o + 1]) > 0) {

                    //the two values are swapped around
                    String swap = tags[o];
                    tags[o] = tags[o + 1];
                    tags[o + 1] = swap;
                }
            }
        }
        return tags;
    }
}