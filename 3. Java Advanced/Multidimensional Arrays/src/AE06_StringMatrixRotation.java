import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AE06_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rotate = scanner.nextLine().replace("(", " ")
                .replace(")", "").split("\\s+");
        int degrees = Integer.parseInt(rotate[1]) / 90;
        if (degrees > 3) {
            degrees %= 4;
        }

        List<String> listOfWords = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            listOfWords.add(input);

            input = scanner.nextLine();
        }

        switch (degrees) {
            case 0:
                zero(listOfWords);
                break;
            case 1:
                one(listOfWords);
                break;
            case 2:
                two(listOfWords);
                break;
            case 3:
                three(listOfWords);
                break;
        }
    }
    public static void zero (List<String> words) {
        int longestWord = longest(words);
        String[][] matrix = new String[words.size()][longestWord];
        for (int i = 0; i < words.size(); i++) {
            int lengthCurrentWord = words.get(i).length();
            for (int j = 0; j < lengthCurrentWord; j++) {
                char letter = words.get(i).charAt(j);
                matrix[i][j] = String.valueOf(letter);
            }
            for (int j = lengthCurrentWord; j < longestWord; j++) {
                matrix[i][j] = " ";
            }
        }
        printMatrix(matrix);
    }

    public static void one (List<String> words) {
        int longestWord = longest(words);
        String[][] matrix = new String[longestWord][words.size()];

        for (int i = 0; i < words.size(); i++) {
            int lengthCurrentWord = words.get(words.size() - 1 - i).length();
            for (int j = 0; j < lengthCurrentWord; j++) {
                char letter = words.get(words.size() - 1 - i).charAt(j);
                matrix[j][i] = String.valueOf(letter);
            }
            for (int j = lengthCurrentWord; j < longestWord; j++) {
                matrix[j][i] = " ";
            }
        }
        printMatrix(matrix);
    }

    public static void two (List<String> words) {
        List<String> wordsReversed = reverse(words);
        int longestWord = longest(wordsReversed);
        String[][] matrix = new String[wordsReversed.size()][longestWord];
        for (int i = 0; i < wordsReversed.size(); i++) {
            int lengthCurrentWord = wordsReversed.get(i).length();
            int difference = longestWord - lengthCurrentWord;
            int letterNum = 0;
            for (int j = lengthCurrentWord - 1; j >= 0; j--) {
                char letter = wordsReversed.get(i).charAt(letterNum++);
                matrix[i][j + difference] = String.valueOf(letter);
            }
            for (int j = 0; j < difference; j++) {
                matrix[i][j] = " ";
            }
        }
        printMatrix(matrix);
    }

    public static void three (List<String> words) {
        int longestWord = longest(words);
        String[][] matrix = new String[longestWord][words.size()];
        for (int i = 0; i < words.size(); i++) {
            int lengthCurrentWord = words.get(i).length();
            int difference = longestWord - lengthCurrentWord;
            for (int j = 0; j < lengthCurrentWord; j++) {
                char letter = words.get(i).charAt(j);
                matrix[longestWord - 1 - j][i] = String.valueOf(letter);
            }
            for (int j = 0; j < difference; j++) {
                matrix[j][i] = " ";
            }
        }
        printMatrix(matrix);
    }

    public static int longest (List<String> words) {
        int longest = 0;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() > longest) {
                longest = words.get(i).length();
            }
        }
        return longest;
    }

    public static void printMatrix (String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static List<String> reverse (List<String> list) {
        List<String> reverse = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverse.add(list.get(i));
        }
        return reverse;
    }
}
