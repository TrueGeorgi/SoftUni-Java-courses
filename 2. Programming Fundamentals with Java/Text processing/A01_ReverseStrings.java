import java.util.Scanner;

public class A01_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        while (!word.equals("end")) {
            String output = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                char letter = word.charAt(i);
                output += letter;
            }

            System.out.printf("%s = %s%n", word, output);

            word = scanner.nextLine();
        }
    }
}
