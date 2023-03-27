import java.util.Scanner;

public class A10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        int odd = oddSum(number);
        int even = evenSum(number);

        System.out.println(odd * even);

    }
    static int evenSum (int startingNum) {
        int sumEven = 0;

        while (startingNum > 0) {
            int currentNum = startingNum % 10;
            if (currentNum % 2 == 0) {
                sumEven += currentNum;
            }
            startingNum /= 10;
        }
        return sumEven;
    }
    static int oddSum (int startingNum) {
        int sumOdd = 0;

        while (startingNum > 0) {
            int currentNum = startingNum % 10;
            if (currentNum % 2 != 0) {
                sumOdd += currentNum;
            }
            startingNum /= 10;
        }
        return sumOdd;
    }
}
