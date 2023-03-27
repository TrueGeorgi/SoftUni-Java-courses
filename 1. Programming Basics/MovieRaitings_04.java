import java.util.Scanner;

public class MovieRaitings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moviesCount = Integer.parseInt(scanner.nextLine());
        double totalRating = 0;
        double minRating = Integer.MAX_VALUE;
        String minRatedMovie = "";
        double maxRating = Integer.MIN_VALUE;
        String maxRatedMovie = "";
        for (int i = 1; i <= moviesCount ; i++) {
            String movie = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            totalRating += rating;
            if (rating > maxRating) {
                maxRating = rating;
                maxRatedMovie = movie;
            }
            if (rating < minRating) {
                minRating = rating;
                minRatedMovie = movie;
            }
        }
        System.out.printf("%s is with highest rating: %.1f%n", maxRatedMovie, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", minRatedMovie, minRating);
        double averageRating = totalRating / moviesCount;
        System.out.printf("Average rating: %.1f", averageRating);
    }
}
