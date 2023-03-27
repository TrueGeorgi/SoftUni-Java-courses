import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class A02_Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String participantsInput = scanner.nextLine();
        List<String> participants = Arrays.stream(participantsInput.split(", "))
                .collect(Collectors.toList()).stream().toList();
        List<String> output = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("end of race")) {
            StringBuilder stringBuilder = new StringBuilder();
            String regexLetter = "[A-Za-z]";
            Pattern patternLetter = Pattern.compile(regexLetter);
            Matcher matcher = patternLetter.matcher(input);
            while (matcher.find()) {
                stringBuilder.append(matcher.group());
            }
            String participant = stringBuilder.toString();
            if (participants.contains(participant) && !output.contains(participant)) {
                output.add(participant);
            }
            input = scanner.nextLine();
        }
        System.out.printf("1st place: %s%n", participants.get(0));
        System.out.printf("2nd place: %s%n", participants.get(1));
        System.out.printf("3rd place: %s%n", participants.get(2));
    }
}
