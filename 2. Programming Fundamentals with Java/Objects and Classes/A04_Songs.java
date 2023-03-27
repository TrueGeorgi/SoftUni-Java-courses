import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A04_Songs {
    static class Song {
        String type;
        String name;
        String time;

        public Song (String type, String name, String time) {
            this.type = type;
            this.name = name;
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int songsNumber = Integer.parseInt(scanner.nextLine());

        List<Song> playlist = new ArrayList<>();

        for (int i = 1; i <= songsNumber ; i++) {
            String[] input = scanner.nextLine().split("_");

            String type = input[0];
            String name = input[1];
            String time = input[2];

            Song song = new Song(type, name, time);

            playlist.add(song);
        }

        String demand = scanner.nextLine();

        if (demand.equals("all")) {
            for (Song song : playlist) {
                String output = song.getName();
                System.out.println(output);
            }
        } else {
            for (Song song : playlist) {
                if (song.getType().equals(demand)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
