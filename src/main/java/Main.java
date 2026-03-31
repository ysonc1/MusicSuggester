import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> genres = new ArrayList<>();

        genres.add("Pop");
        genres.add("R&B");
        genres.add("Hip Hop");
        genres.add("Classical");
        genres.add("Show Tunes");
        genres.add("Jazz");
        genres.add("Indie");

        Random random = new Random();
        String randomGenre = genres.get(random.nextInt(genres.size()));
        System.out.println(randomGenre);
    }
}