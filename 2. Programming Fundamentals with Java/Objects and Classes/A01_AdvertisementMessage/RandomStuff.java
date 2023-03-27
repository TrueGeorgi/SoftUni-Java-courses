package A01_AdvertisementMessage;

import java.util.Random;
import java.util.Scanner;

public class RandomStuff {
    public static void main(String[] args) {
        String[] phrases = {"Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."};

        String[] events = {"Now I feel good.",
        "I have succeeded with this product.",
        "Makes miracles. I am happy of the results!",
        "I cannot believe but now I feel awesome.",
        "Try it yourself, I am very satisfied.",
        "I feel great!"};

        String[] authors = {"Diana",
        "Petya",
        "Stella",
        "Elena",
        "Katya",
        "Iva",
        "Annie",
        "Eva"};

        String[] cities = {"Burgas",
        "Sofia",
        "Plovdiv",
        "Varna",
        "Ruse"};

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= input ; i++) {
            int phraseNum = random.nextInt(phrases.length);
            int eventNum = random.nextInt(events.length);
            int authorsNum = random.nextInt(authors.length);
            int citiesNum = random.nextInt(cities.length);
           String currentPhrase = phrases[phraseNum];
           String currentEvent = events[eventNum];
           String currentAuthor = authors[authorsNum];
           String currentCity = cities[citiesNum];

            System.out.printf("%s %s %s - %s%n", currentPhrase, currentEvent, currentAuthor, currentCity);
        }
    }
}
