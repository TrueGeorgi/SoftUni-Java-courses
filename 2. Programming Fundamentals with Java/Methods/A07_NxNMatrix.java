import java.util.Scanner;

public class A07_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        nXn(n);
    }
    public static void nXn (int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number ; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
