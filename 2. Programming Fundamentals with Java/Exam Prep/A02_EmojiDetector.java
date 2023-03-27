import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A02_EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regexEmoji = "([*:]){2}[A-Z][a-z]{2,}\\1{2}";
        Pattern pattern = Pattern.compile(regexEmoji);
        Matcher matcher = pattern.matcher(input);
        List<String> emojis = new ArrayList<>();
        while (matcher.find()) {
            emojis.add(matcher.group());
        }
        String regexNums = "\\d";
        pattern = Pattern.compile(regexNums);
        matcher = pattern.matcher(input);
        long threshold = 1;
        while (matcher.find()) {
            long temporaryNum = Long.parseLong(matcher.group());
            threshold = threshold * temporaryNum;
        }
        Map<String, Integer> emojisCoolness = new LinkedHashMap<>();
        for (String emoji : emojis) {
            int emojiCoolness = 0;
            String regex = "[A-Za-z]+";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(emoji);
            while (matcher.find()) {
                for (int i = 2; i <= matcher.group().length() + 1; i++) {
                    char currentNumber = emoji.charAt(i);
                    emojiCoolness += currentNumber;
                }
            }
            emojisCoolness.put(emoji, emojiCoolness);
        }
        List<String> output = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : emojisCoolness.entrySet()) {
            if (entry.getValue() >= threshold) {
               output.add(entry.getKey());
            }
        }
        System.out.printf("Cool threshold: %d%n", threshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", emojis.size());
        output.forEach(System.out::println);
    }
}
