import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A02_EncryptingPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spins = Integer.parseInt(scanner.nextLine());
        String regex = "([^\\s]+)([\\>]{1})(?<numbers>[\\d]{3})([\\|]{1})(?<smallLetters>[a-z]{3})(\\|{1})(?<bigLetters>[A-Z]{3})(\\|{1})(?<symbols>[^<>]{3})(\\<{1})\\1$";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 1; i <= spins; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String numbers = matcher.group("numbers");
                String smallLetters = matcher.group("smallLetters");
                String bigLetters = matcher.group("bigLetters");
                String symbols = matcher.group("symbols");
                String output = numbers + smallLetters + bigLetters + symbols;
                System.out.println("Password: " + output);
            } else {
                System.out.println("Try another password!");
            }
        }
    }
}
