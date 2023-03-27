import java.util.Scanner;

public class A07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int times = Integer.parseInt(scanner.nextLine());

        System.out.println(repeats(input, times));
    }

    public static String repeats (String word, int times) {
        String finalWord = "";
        for (int i = 1; i <= times ; i++) {
            finalWord += word;
        }
        return finalWord;
    }
}
