import java.util.Scanner;

public class AE04_TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        System.out.print(1 + " ");

        int lastOne = 1;
        int lastTwo = 0;
        int lastThree = 0;
        for (int i = 2; i <= num; i++) {
            int currentNum = lastOne + lastTwo + lastThree;
            lastThree = lastTwo;
            lastTwo = lastOne;
            lastOne = currentNum;
            System.out.print(currentNum + " ");
        }
    }
}
