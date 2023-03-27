import java.util.Scanner;

public class AE06_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        boolean openingExist = false;
        boolean print = true;

        for (int i = 1; i <= lines; i++) {
            String input = scanner.nextLine();
            // "("
           if (input.equals("(") && openingExist) {
               print = false;
               System.out.println("UNBALANCED");
                break;
            } else if (input.equals("(")) {
                openingExist = true;
            } else if (input.equals(")") && !openingExist) {
               print = false;
               System.out.println("UNBALANCED");
                break;
            } else if (input.equals(")")) {
                openingExist = false;
            }
        }
        if (openingExist && print) {
            System.out.println("UNBALANCED");
        } else if (!openingExist && print){
            System.out.println("BALANCED");
        }
    }
}
