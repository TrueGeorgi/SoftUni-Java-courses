import java.util.Scanner;

public class A02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        int numberToBePrinted = numberOfVowels(input);

        System.out.println(numberToBePrinted);
    }
    public static int numberOfVowels (String word) {
        int numberOfVowels = 0;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (currentChar == 97
                    || currentChar == 101
                    || currentChar == 105
                    || currentChar == 111
                    || currentChar == 117) {
                numberOfVowels++;
            }
        }

        return numberOfVowels;
    }
}
