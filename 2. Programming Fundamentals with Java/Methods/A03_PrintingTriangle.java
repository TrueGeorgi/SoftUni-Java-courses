import java.util.Scanner;

public class A03_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        triangle(input);
    }
    public static void triangle (int number) {
        for (int i = 1; i <= number; i++) {
            int n = -1 - i;
            for (int j = i; j >= 1 ; j--) {
                System.out.print((i + n) + 2 + " ");
                n++;
            }
            System.out.println("");
        }
        for (int i = number - 1; i >= 1 ; i--) {
            int n = i - 1;
            for (int j = 1; j <= i; j++) {
                System.out.print((i - n) + " ");
                n--;
            }
            System.out.println("");
        }
    }
}
