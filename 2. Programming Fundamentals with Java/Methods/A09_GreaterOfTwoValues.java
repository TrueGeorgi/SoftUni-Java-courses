import java.util.Scanner;

public class A09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String calculation = scanner.nextLine();

        switch (calculation) {
            case "int":
                int inputInt1 = Integer.parseInt(scanner.nextLine());
                int inputInt2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(inputInt1, inputInt2));
                break;
            case "char":
                char inputChar1 = scanner.nextLine().charAt(0);
                char inputChar2 = scanner.nextLine().charAt(0);
                System.out.println(getMax(inputChar1, inputChar2));
                break;
            case "string":
                String inputString1 = scanner.nextLine();
                String inputString2 = scanner.nextLine();
                System.out.println(getMax(inputString1, inputString2));
                break;
        }
    }
    static int getMax (int number1, int number2) {
        if (number1 >= number2) {
            return number1;
        }
        return number2;
    }
    static char getMax (char symbol1, char symbol2) {
        if (symbol1 >= symbol2) {
            return symbol1;
        }
        return symbol2;
    }
    static String getMax (String word1, String word2) {
        if (word1.compareTo(word2) >= 0) {
            return word1;
        }
        return word2;
    }
}
