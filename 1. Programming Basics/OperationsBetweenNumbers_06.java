import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        double result = 0;

        switch (symbol) {
            case "+":
                result = n1 + n2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even",n1,symbol,n2, (int)result);
                } else {
                    System.out.printf("%d %s %d = %d - odd",n1,symbol,n2, (int)result);
                }
                break;
            case "-":
                    result = n1 - n2;
                    if (result % 2 == 0) {
                        System.out.printf("%d %s %d = %d - even",n1,symbol,n2, (int)result);
                    } else {
                        System.out.printf("%d %s %d = %d - odd",n1,symbol,n2, (int)result);
                    }
                break;
            case "*":
                result = n1 * n2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even",n1,symbol,n2, (int)result);
                } else {
                    System.out.printf("%d %s %d = %d - odd",n1,symbol,n2, (int)result);
                }
                break;
            case "/":
                if (n1 != 0) {
                    result = n1 * 1.0 / n2;
                    System.out.printf("%d %s %d = %.2f",n1,symbol,n2,result);
                } else {
                    System.out.printf("Cannot divide %d by zero",n1);
                }
                break;
            case "%":
                if (n1 != 0) {
                    result = n1 % n2;
                    System.out.printf("%d %s %d = %d",n1,symbol, n2,(int)result);
                } else {
                    System.out.printf("Cannot divide %d by zero",n1);
                }
                break;
        }
    }
}
