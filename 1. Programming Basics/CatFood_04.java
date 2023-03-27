import java.util.Scanner;

public class CatFood_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cats = Integer.parseInt(scanner.nextLine());
        int smallCats = 0;
        int bigCats = 0;
        int hugeCats = 0;
        double foodAmount = 0;
        for (int i = 1; i <= cats ; i++) {
            double foodGrams = Double.parseDouble(scanner.nextLine());
            foodAmount += foodGrams;
            if (foodGrams >= 100 && foodGrams < 200) {
                smallCats++;
            } else if (foodGrams >= 200 && foodGrams < 300) {
                bigCats++;
            } else if (foodGrams >= 300 && foodGrams < 400) {
                hugeCats++;
            }
        }
        double foodCost = 12.45 * (foodAmount / 1000);
        System.out.printf("Group 1: %d cats.%n", smallCats);
        System.out.printf("Group 2: %d cats.%n", bigCats);
        System.out.printf("Group 3: %d cats.%n", hugeCats);
        System.out.printf("Price for food per day: %.2f lv.",foodCost);
    }
}
