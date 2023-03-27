import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A06_ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "\\b(?<mail>(?<user>[A-Za-z]+[.\\-_]?[A-Za-z]*)@(?<host>[A-Za-z]+\\-*[A-Za-z]+)\\.{1}[A-Za-z]+(\\.{1}[A-Za-z]+)*)\\b";
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
