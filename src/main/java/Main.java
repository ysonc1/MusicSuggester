import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> genres = new ArrayList<>();
        ArrayList<String> popSongs = new ArrayList<>();
        ArrayList<String> showTunesSongs = new ArrayList<>();
        ArrayList<String> indieSongs = new ArrayList<>();
        ArrayList<String> rnbSongs = new ArrayList<>();
        ArrayList<String> hiphopSongs = new ArrayList<>();
        ArrayList<String> jazzSongs = new ArrayList<>();
        ArrayList<String> classicalSongs = new ArrayList<>();

        genres.add("Pop");
        genres.add("R&B");
        genres.add("Hip Hop");
        genres.add("Classical");
        genres.add("Show Tunes");
        genres.add("Jazz");
        genres.add("Indie");

        popSongs.add("Baby by Justin Bieber");
        popSongs.add("drivers license by Olivia Rodrigo");
        popSongs.add("Manchild by Sabrina Carpenter");

        showTunesSongs.add("Defying Gravity from Wicked");
        showTunesSongs.add("Wait for It from Hamilton");
        showTunesSongs.add("No Me Diga from In the Heights");

        indieSongs.add("Earrings by Malcolm Todd");
        indieSongs.add("Calling After Me by Wallows");
        indieSongs.add("No Use by Christian Leave");

        rnbSongs.add("Snooze by SZA");
        rnbSongs.add("Lost by Frank Ocean");
        rnbSongs.add("Heartbreak Anniversary by Giveon");

        hiphopSongs.add("Bodak Yellow by Cardi B");
        hiphopSongs.add("HUMBLE. by Kendrick Lamar");
        hiphopSongs.add("Keep Ya Head Up by 2Pac");

        jazzSongs.add("From the Start by Laufey");
        jazzSongs.add("Fly Me to the Moon by Frank Sinatra and Count Basie");
        jazzSongs.add("A Lovely Night from La La Land");

        classicalSongs.add("Clair de Lune by Debussy");
        classicalSongs.add("Moonlight Sinata by Beethoven");
        classicalSongs.add("The Four Seasons by Vivaldi");



        Random random = new Random();
        String randomGenre = genres.get(random.nextInt(genres.size()));
        System.out.println(randomGenre);

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Would you like song recommendations from the genre? (Answer y or n)");
        String songRecs = scanner.nextLine();

        if (songRecs.equals("y")){
            if (randomGenre.equals("Pop")){
                for (String popSong : popSongs) {
                    System.out.println(popSong);
                }
            } else if (randomGenre.equals("Show Tunes")){
                for (String showTunesSong : showTunesSongs){
                    System.out.println(showTunesSong);
                }
            } else if (randomGenre.equals("Indie")){
                for (String indieSong : indieSongs){
                    System.out.println(indieSong);
                }
            }
        }else{
            return;
        }
    }

}