import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A02_MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([@#])[A-Za-z]{3,}\\1\\1[a-zA-Z]{3,}\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> pairs = new ArrayList<>();
        while (matcher.find()) {
            pairs.add(matcher.group());
        }
        Map<String, String> mirrorWords = new LinkedHashMap<>();
        for (int i = 0; i < pairs.size(); i++) {
            regex = "[A-Za-z]+";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(pairs.get(i));
            List<String> check = new ArrayList<>();
            while (matcher.find()) {
                check.add(matcher.group());
            }
            String word = check.get(0);
            String wordMirror = check.get(1);
            StringBuilder mirrorCheck = new StringBuilder();
            for (int j = wordMirror.length() - 1; j >= 0; j--) {
                char currentLetter = wordMirror.charAt(j);
                mirrorCheck.append(currentLetter);
            }
            String mirrorCheckStr = String.valueOf(mirrorCheck);
            if (word.equals(mirrorCheckStr)) {
                mirrorWords.put(word, wordMirror);
            }
        }
        if (pairs.isEmpty()) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", pairs.size());
        }
        if (mirrorWords.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            String output = "";
            for (Map.Entry<String, String> entry : mirrorWords.entrySet()) {
                output += entry.getKey() + " <=> " + entry.getValue() + ", ";
            }
            output = output.trim().replaceAll(",\\s*$", "");
            System.out.println(output);
        }
    }
}
