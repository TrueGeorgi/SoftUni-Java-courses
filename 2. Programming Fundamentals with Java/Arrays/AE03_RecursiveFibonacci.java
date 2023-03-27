import java.util.Scanner;

public class AE03_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //No Arrays

        int fibonacci = Integer.parseInt(scanner.nextLine());

        int first = 1;
        int second = 1;
        if (fibonacci == 1 || fibonacci == 2) {
            System.out.println(first);
        } else {
            int third = 0;
            int saved = 0;
            for (int i = 3; i <= fibonacci; i++) {
                third = first + second;
                saved = second;
                second = third;
                first = saved;
            }
            System.out.println(third);
        }
    }
}
