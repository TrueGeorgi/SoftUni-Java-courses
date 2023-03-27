import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class A08_LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");
        double sum = 0;
        for (int i = 0; i < inputArr.length; i++) {
            StringBuilder currentString = new StringBuilder(inputArr[i]);
            char afterNum = currentString.reverse().charAt(0);
            char beforeNum = currentString.reverse().charAt(0);
            double num = Double.parseDouble(currentString.substring(1, currentString.length()-1));
            //Before the Number
            if (beforeNum >= 65 && beforeNum <= 90) {
                int position = alphabeticalPositionUpper(beforeNum);
                num /= position;
            } else {
                int position = alphabeticalPositionLower(beforeNum);
                num *= position;
            }
            //After the number
            if (afterNum >= 65 && afterNum <= 90) {
                int position = alphabeticalPositionUpper(afterNum);
                num -= position;
            } else {
                int position = alphabeticalPositionLower(afterNum);
                num += position;
            }
            sum += num;
        }
        System.out.printf("%.2f", sum);
    }
    public static Integer alphabeticalPositionLower (char letter) {
        Map<Character, Integer> alphabet = new TreeMap<>();
        int count = 1;
        for (int i = 97; i <= 122; i++) {
            alphabet.put((char)i, count);
            count++;
        }
        return alphabet.get(letter);
    }
    public static Integer alphabeticalPositionUpper (char letter) {
        Map<Character, Integer> alphabet = new TreeMap<>();
        int count = 1;
        for (int i = 65; i <= 90; i++) {
            alphabet.put((char)i, count);
            count++;
        }
        return alphabet.get(letter);
    }
}
