import java.util.Scanner;

public class A02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String wordOne = input.split(" ")[0];
        String wordTwo = input.split(" ")[1];
        int finalScore = 0;

        if (wordOne.length() > wordTwo.length()) {
            finalScore = isBigger(wordOne, wordTwo);
        } else if (wordTwo.length() > wordOne.length()) {
            finalScore = isBigger(wordTwo, wordOne);
        } else {
            finalScore = equals(wordOne, wordTwo);
        }
        System.out.println(finalScore);
    }
    public static Integer equals (String firstWord, String secondWord) {
        int sum = 0;
        for (int i = 0; i < firstWord.length(); i++) {
            sum += firstWord.charAt(i) * secondWord.charAt(i);
        }
        return sum;
    }
    public static Integer isBigger (String firstWord, String secondWord) {
        int sum = 0;
        for (int i = 0; i < secondWord.length(); i++) {
            char first = firstWord.charAt(i);
            char second = secondWord.charAt(i);
            sum += first * second;
        }
        for (int i = secondWord.length(); i < firstWord.length(); i++) {
            char first = firstWord.charAt(i);
            sum += first;
        }
        return sum;
    }
}
