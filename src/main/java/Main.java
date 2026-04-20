import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> genres = new ArrayList<>();
        ArrayList<String> popSongs = new ArrayList<>();
        ArrayList<String> showTunesSongs = new ArrayList<>();
        ArrayList<String> indieSongs = new ArrayList<>();

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

        Random random = new Random();
        String randomGenre = genres.get(random.nextInt(genres.size()));
        System.out.println(randomGenre);

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Would you like song recommendations from the genre? (Answer y or n)");
        String songRecs = scanner.nextLine();

        if (songRecs.equals("y")){
            if (randomGenre.equals("Pop")){
                for songs in popSongs{
                    System.out.println(songs);
                }
            } else if (randomGenre.equals("Show Tunes")){
                for songs in showTunesSongs{
                    System.out.println(songs);
                }
            } else if (randomGenre.equals("Indie")){
                for songs in indieSongs{
                    System.out.println(songs);
                }
            }
        }else{
            return;
        }
    }

}