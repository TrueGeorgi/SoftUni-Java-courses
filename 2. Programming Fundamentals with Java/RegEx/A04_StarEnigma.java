import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A04_StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int messages = Integer.parseInt(scanner.nextLine());
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();
        for (int i = 1; i <= messages ; i++) {
            String message = scanner.nextLine();
            String decryptedMessage = decryption(message);
            String regex = "@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>[0-9]+)[^@\\-!:>]*!(?<attack>[A,D])![^@\\-!:>]*->(?<soldierCount>[0-9]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(decryptedMessage);
            while (matcher.find()) {
                String planet = matcher.group("planet");
                int population = Integer.parseInt(matcher.group("population"));
                String attack = matcher.group("attack");
                int soldiers = Integer.parseInt(matcher.group("soldierCount"));
                if (attack.equals("A")) {
                    attackedPlanets.add(planet);
                } else {
                    destroyedPlanets.add(planet);
                }
            }
        }
        Collections.sort(attackedPlanets);
        Collections.sort(destroyedPlanets);
        System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
        for (int i = 0; i < attackedPlanets.size(); i++) {
            System.out.printf("-> %s%n", attackedPlanets.get(i));
        }
        System.out.printf("Destroyed planets: %d%n", destroyedPlanets.size());
        for (int i = 0; i < destroyedPlanets.size(); i++) {
            System.out.printf("-> %s%n", destroyedPlanets.get(i));
        }
    }
    public static Integer countKeys (Pattern keyPattern, String text) {
        Matcher matcher = keyPattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
    public static String decryption (String message) {
        String keyRegex = "[S,T,A,R,s,t,a,r]";
        Pattern keyPattern = Pattern.compile(keyRegex);
        int keys = countKeys(keyPattern, message);
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < message.length(); j++) {
            char currentChar = message.charAt(j);
            char updatedChar = (char) (currentChar - keys);
            builder.append(updatedChar);
        }
        return builder.toString();
    }
}
