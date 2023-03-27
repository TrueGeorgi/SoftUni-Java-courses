import java.util.Scanner;

public class A04_ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] symbols = scanner.nextLine().split(" ");

        for (int i = 0; i < symbols.length / 2; i++) {
            String savedSymbol = symbols[i];
            symbols[i] = symbols[symbols.length - 1 - i];
            symbols[symbols.length - 1 - i] = savedSymbol;
        }
        for (int i = 0; i < symbols.length; i++) {
            System.out.print(symbols[i] + " ");
        }
    }
}
