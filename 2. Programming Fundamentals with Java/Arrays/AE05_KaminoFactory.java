import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AE05_KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthDNA = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int longestBest = 0;
        int sumBest = 0;
        int[] bestDNA = new int[lengthDNA];
        int bestRow = 0;
        int currentRow = 0;
        int bestBeginIndex = 10000;


        while (!input.equals("Clone them!")) {
            currentRow++;
            int longest = 0;
            int currentLength = 0;
            int indexBegin = -1;
            int currentBegin = -1;
            int sum = 0;

            int[] numbers = Arrays.stream(input.split("!+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == 1) {
                    sum++;
                    currentLength++;
                    if (longest == 1) {
                        currentBegin = i;
                    }
                    if (currentLength > longest) {
                        longest = currentLength;
                        indexBegin = currentBegin;
                    }
                } else {
                    currentLength = 0;
                }
            }
            if (longest >= longestBest) {
                if (indexBegin < bestBeginIndex) {
                    bestBeginIndex = indexBegin;
                    longestBest = longest;
                    sumBest = sum;
                    bestDNA = numbers;
                    bestRow = currentRow;
                } else if ( indexBegin == bestBeginIndex) {
                    if (sum > sumBest) {
                        longestBest = longest;
                        sumBest = sum;
                        bestDNA = numbers;
                        bestRow = currentRow;
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestRow, sumBest);
        for (int i = 0; i < bestDNA.length; i++) {
            System.out.print(bestDNA[i] + " ");
        }
    }
}
