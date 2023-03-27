import java.util.Scanner;

public class A04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < bannedWords.length; i++) {
            String word = bannedWords[i];
            text = textCensoring(word, text);
        }
        System.out.println(text);
    }
    public static String textCensoring (String word, String text) {
        int length = word.length();
        StringBuilder asterisk = new StringBuilder();
        for (int i = 0; i < length; i++) {
            asterisk.append("*");
        }
        while (text.contains(word)) {
           text = text.replace(word, asterisk);
        }

        return text;
    }
}
