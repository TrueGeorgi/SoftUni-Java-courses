import java.util.Scanner;

public class A05_PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int finish = Integer.parseInt(scanner.nextLine());
        for (int i = start; i <= finish ; i++) {
            char currentSymbol = (char) i;
            if (i != finish) {
                System.out.print(currentSymbol + " ");
            } else {
                System.out.print(currentSymbol);
            }
        }
    }
}
