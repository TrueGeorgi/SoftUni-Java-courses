package A02_Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        String title = input.split(", ")[0];
        String content = input.split(", ")[1];
        String author = input.split(", ")[2];

        Article output = new Article(title, content, author);

        for (int i = 1; i <= number; i++) {
            String update = scanner.nextLine();
            String action = update.split(": ")[0];
            String newInput = update.split(": ")[1];
            switch (action) {
                case "Edit":
                    output.setContent(newInput);
                    break;
                case "ChangeAuthor":
                    output.setAuthor(newInput);
                    break;
                case "Rename":
                    output.setTitle(newInput);
                    break;
            }
        }
        System.out.println(output);
    }
}
