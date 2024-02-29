package business;

import utils.ArrayUtils;

/**
 * @author michelle
 */
public class Playlist{
    private Song[] songs;
    private int numSongs;

    public Playlist(Song[] songs) {
        this.songs = songs;
        // Assumes the array is full
        numSongs = songs.length;
    }

    // To be used where the array is not full, i.e. there are empty slots
    public Playlist(Song[] songs, int numSongs) {
        this.songs = songs;
        this.numSongs = numSongs;
    }

    /**
     * Find all songs in a playlist containing a specific tag.
     *
     * @param tag The tag to search in songs.
     * @return Array containing all songs that contain the specified tag. If the tag is null, empty array is returned.
     */
    public Song[] searchByTag(String tag) {
        if (tag == null || tag.isEmpty()) {
            return new Song[0];
        }
        Song[] result = new Song[songs.length];
        int t = 0;

        for (var song : songs) {
            if (song.containsTag(tag)) {
                result[t] = song;
            }
        }

        return ArrayUtils.copy(result, 0, t);
    }

    /**
     * Returns all songs from the playlist.
     *
     * @return Song array containing all the songs. If there are no songs, an empty array is returned.
     */
    public Song[] getAllSongs() {
        if (songs == null) {
            return new Song[0];
        }
        return songs;
    }

    /**
     * Finds the most popular song in the playlist. If there are more songs with the same popularity, the first one is returned.
     *
     * @return The most popular song.
     */
    public Song findMostPopular() {
        var highestSong = songs[0];

        for (int i = 1; i < songs.length; i++) {
            if (songs[i].getRating() > highestSong.getRating()) {
                highestSong = songs[i];
            }
        }
        return highestSong;
    }

    /**
     * The playlist's songs are sorted based on their genre alphabetically.
     * Utilizes bubble sort.
     */
    public void sortSongsByGenre() {
        boolean swapped = false;
        Song tmp;

        // Do one iteration of bubble sort
        for (int i = 1; i < songs.length; i++) {
            if (songs[i].getGenre().compareToIgnoreCase(songs[i - 1].getGenre()) < 0) {
                tmp = songs[i];
                songs[i] = songs[i - 1];
                songs[i - 1] = tmp;
                swapped = true;
            }
        }
        // If elements were swapped, continue with sorting
        if (swapped) {
            sortSongsByGenre();
        }
        // No elements were swapped, the array is sorted
    }

    /**
     * The songs are sorted by their number of tags in descending order.
     * Utilizes selection sort.
     */
    public void sortSongsByNumTags() {
        for (int i = 0; i < songs.length; i++) {
            int maxNumOfTags = songs[i].getTagCount();
            int position = i;
            Song tmp;

            for (int j = i + 1; j < songs.length; j++) {
                if (songs[j].getTagCount() > maxNumOfTags) {
                    maxNumOfTags = songs[j].getTagCount();
                    position = j;
                }
            }

            if (position != i) {
                tmp = songs[i];
                songs[i] = songs[position];
                songs[position] = tmp;
            }
        }
    }

    public String toStringNumbered() {
        final StringBuilder sb = new StringBuilder();

        for (int i = 0; i < songs.length; i++) {
            sb
                    .append(i + 1)
                    .append(". ")
                    .append(songs[i].formatForDisplay())
                    .append('\n');
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (var song : songs) {
            sb
                    .append(song.formatForDisplay())
                    .append('\n');
        }
        return sb.toString();
    }
}
