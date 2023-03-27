import java.util.Scanner;

public class A03_ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String input = scanner.nextLine();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        String reversed = sb.toString();
        int begin = reversed.indexOf(".");
        int index = reversed.indexOf("\\");

        String name = reversed.substring(begin + 1, index);
        String extension = reversed.substring(0, begin);

        StringBuilder reversedSb1 = new StringBuilder(name).reverse();
        StringBuilder reversedSb2 = new StringBuilder(extension).reverse();

        String finalName = reversedSb1.toString();
        String finalExtension = reversedSb2.toString();

        System.out.printf("File name: %s%n", finalName);
        System.out.printf("File extension: %s", finalExtension);

    }
}
