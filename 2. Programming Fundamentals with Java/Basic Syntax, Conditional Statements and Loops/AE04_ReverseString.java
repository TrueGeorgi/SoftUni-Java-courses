import java.util.Scanner;

public class AE04_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            output = a + output;
        }
        System.out.print(output);
    }
}
