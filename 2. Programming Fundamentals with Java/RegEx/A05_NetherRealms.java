import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A05_NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] demons = input.split("\\s*,+\\s*");
        for (int i = 0; i < demons.length; i++) {
            String demon = demons[i];
            int health = health(demon);
            double damage = damage(demon);
            System.out.printf("%s - %d health, %.2f damage%n", demon, health, damage);
        }
    }
    public static Integer health (String demon) {
        String regex = "[^0-9\\+\\-\\*\\/\\.]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(demon);
        int health = 0;
        while (matcher.find()) {
            char currentChar = matcher.group().charAt(0);
            health += currentChar;
        }
        return health;
    }
    public static Double damage (String demon) {
        String regex = "(?<calculation>[-+]?)(\\d+\\.?\\d*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(demon);
        double damage = 0;
        while (matcher.find()) {
            damage += Double.parseDouble(matcher.group());
        }
        String regexExtra = "[\\/?\\*?]";
        Pattern patternExtra = Pattern.compile(regexExtra);
        Matcher matcherExtra = patternExtra.matcher(demon);
        List<String> extra = new ArrayList<>();
        while (matcherExtra.find()) {
                extra.add(matcherExtra.group());
        }
        for (int i = 0; i < extra.size(); i++) {
            if (extra.get(i).equals("/") && damage != 0) {
                damage /= 2;
            } else if (extra.get(i).equals("*")) {
                damage *= 2;
            }
        }
        return damage;
    }
}
