import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class AE02_KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Consumer<String> printSir = name -> System.out.println("Sir " + name);


        Arrays.stream(input).forEach(printSir);
    }
}
