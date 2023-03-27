import java.util.Scanner;

public class A03_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String keyWord = scanner.nextLine();
        String input = scanner.nextLine();

        while (input.contains(keyWord)) {
            input = input.replace(keyWord, "");
        }
        System.out.println(input);
    }
}
