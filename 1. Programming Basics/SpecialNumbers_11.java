import java.util.Scanner;

public class SpecialNumbers_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1111; i <= 9999 ; i++) {
            int trashNumber = i;
            boolean print = true;
            while (trashNumber > 0) {
                    int oneNum = trashNumber % 10;
                    if (oneNum != 0 && n % oneNum != 0) {
                        print = false;
                    } else if (oneNum == 0) {
                        print = false;
                    }
                    trashNumber /= 10;
                }
            if (print) {
                System.out.print(i + " ");
            }
        }
    }
}
