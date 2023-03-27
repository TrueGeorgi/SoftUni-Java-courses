import java.util.Scanner;

public class A10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        topNumber(n);

    }
    public static void topNumber (int num) {

        for (int i = 1; i <=num; i++) {
            boolean topNumber = false;
            int toBeManipulated = i;
            int digitsSum = 0;
            boolean oddExist = false;

            while (toBeManipulated > 0) {
                int currentInt = toBeManipulated % 10;
                digitsSum += currentInt;
                if (currentInt % 2 != 0) {
                    oddExist = true;
                }
                toBeManipulated /= 10;
            }
            if (digitsSum % 8 == 0 && oddExist) {
                topNumber = true;
            }
            if (topNumber) {
                System.out.println(i);
            }
        }
    }
}
