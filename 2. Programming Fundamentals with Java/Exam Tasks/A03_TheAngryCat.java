import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A03_TheAngryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> priceRatings = Arrays
                .stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int entryPoint = Integer.parseInt(scanner.nextLine());
        int entryPointNum = priceRatings.get(entryPoint);

        String value = scanner.nextLine();

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < entryPoint; i++) {
            if (value.equals("cheap")) {
                if (priceRatings.get(i) < entryPointNum) {
                    leftSum += priceRatings.get(i);
                }
            } else {
                if (priceRatings.get(i) >= entryPointNum) {
                    leftSum += priceRatings.get(i);
                }
            }
        }

        for (int i = entryPoint + 1; i < priceRatings.size(); i++) {
            if (value.equals("cheap")) {
                if (priceRatings.get(i) < entryPointNum) {
                    rightSum += priceRatings.get(i);
                }
            } else {
                if (priceRatings.get(i) >= entryPointNum) {
                    rightSum += priceRatings.get(i);
                }
            }
        }

        if (rightSum > leftSum) {
            System.out.printf("Right - %d", rightSum);
        } else {
            System.out.printf("Left - %d", leftSum);
        }
    }
}
