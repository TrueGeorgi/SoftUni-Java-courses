import java.util.Scanner;

public class A06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = Integer.parseInt(scanner.nextLine());
        int inputNumKept = inputNum;
        int currentNum = 0;
        int sumSingleFacturel = 1;
        int sumAllFacturels = 0;
        while (inputNum > 0) {
            currentNum = inputNum % 10;
            if (currentNum > 1)
            for (int i = 2; i <= currentNum ; i++) {
                sumSingleFacturel *= i;
            } else {
                sumSingleFacturel = currentNum;
            }
            sumAllFacturels += sumSingleFacturel;
            sumSingleFacturel = 1;
            inputNum /= 10;
        }
        if (inputNumKept == sumAllFacturels) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
