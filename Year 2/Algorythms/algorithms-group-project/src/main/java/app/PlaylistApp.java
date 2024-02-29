package app;

import business.Playlist;
import business.Song;
import utils.InputUtils;
import utils.SongFileUtils;

import java.util.Scanner;

/**
 * @author michelle
 */
public class PlaylistApp {
    public static void main(String[] args) {
        // Init
        Song[] songsFromFile = SongFileUtils.readSongFile("sampleSongInput.txt");
        Playlist playlist = new Playlist(songsFromFile);
        String option;
        Scanner keyboard = new Scanner(System.in);

        // App
        System.out.println("Welcome to playlist managing app. (trademark pending)");
        System.out.println("Your playlist has been automatically loaded.");
        while (true) {
            option = InputUtils.getInput("> ");
            switch (option) {
                case "edit":
                    System.out.println("Please enter a song to edit");
                    String chosenSong = keyboard.next();
                    editSong(playlist, chosenSong);
                    break;
                case "print":
                    System.out.println(playlist);
                    break;
                case "popular":
                    Song mostPopularSong = playlist.findMostPopular();
                    System.out.println("The most popular song in the playlist is:");
                    System.out.println(mostPopularSong.formatForDisplay());
                    break;
                case "sort genre":
                    System.out.println("The old playlist");
                    System.out.println(playlist);
                    playlist.sortSongsByGenre();
                    System.out.println("Playlist sorted");
                    System.out.println("Here's the new playlist");
                    System.out.println(playlist);
                    break;
                case "sort tag":
                    System.out.println("The old playlist");
                    System.out.println(playlist);
                    playlist.sortSongsByNumTags();
                    System.out.println("Playlist sorted");
                    System.out.println("Here's the new playlist");
                    System.out.println(playlist);
                    break;
                case "help":
                    printHelp();
                    break;
                case "exit":
                    System.out.println("Bye :)");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Command not recognized type 'help' for a lists of commands.");
            }
        }
    }

    /**
     * Prints the help message with all commands
     */
    private static void printHelp() {
        final String commands = "List of available commands:\n" +
                "       edit    Edit a song's details\n" +
                "      print    Display all songs in playlist\n" +
                "    popular    Find the most popular song\n" +
                " sort genre    Sort the songs by genre in alph. order\n" +
                "   sort tag    Sort the song by number of tags\n" +
                "       help    Display this text\n" +
                "       exit    Exit the app";
        System.out.println(commands);
    }

    /**
     * Goes through with the user to edit a song in a playlist
     * @param playlist The playlist to edit a song from
     */
    private static void editSong(Playlist playlist, String SongName) {
        if(playlist.equals(Song) = true){

        }

    }
}
