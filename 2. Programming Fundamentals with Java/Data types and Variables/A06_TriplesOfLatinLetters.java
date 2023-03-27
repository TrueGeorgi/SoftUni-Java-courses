import java.util.Scanner;

public class A06_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number ; i++) {
            char firstLetter = (char) (97 + i);
            for (int j = 0; j < number; j++) {
                char secondLetter = (char) (97 + j);
                for (int k = 0; k < number; k++) {
                    char thirdLetter = (char) (97 + k);
                    System.out.printf("%c%c%c%n", firstLetter, secondLetter, thirdLetter);
                }
            }

        }
    }
}
