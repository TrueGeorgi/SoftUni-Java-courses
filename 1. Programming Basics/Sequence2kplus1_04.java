import java.util.Scanner;

public class Sequence2kplus1_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int j = 1;
        while (j <= n) {
            System.out.println(j);
            j = j * 2 + 1;
        }
    }
}
