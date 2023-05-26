import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class A06_FindEvensorOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[] bonds = Arrays.stream(scanner.nextLine().split("\\s+"))
               .mapToInt(Integer::parseInt)
               .toArray();

       int lowerBound = bonds[0];
       int upperBound = bonds[1];

       String oddOrEven = scanner.nextLine();

       Predicate<Integer> isOdd = n -> n % 2 != 0;
       Predicate<Integer> isEven = n -> n % 2 == 0;

       switch (oddOrEven) {
           case "odd":
               print(isOdd, lowerBound, upperBound);
               break;
           case "even":
               print(isEven, lowerBound, upperBound);
               break;
       }
    }
    public static void print (Predicate<Integer> condition, int lowerLimit, int upperLimit) {
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (condition.test(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
