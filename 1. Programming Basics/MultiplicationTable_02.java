import java.util.Scanner;

public class MultiplicationTable_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int result = 0;

        for (int i = 1; i <= 10 ; i++) {
            first = i;
            for (int j = 1; j <= 10 ; j++) {
                second = j;
                result = first * second;
                System.out.printf("%d * %d = %d%n", first, second, result);
            }
        }
    }
}
