import java.util.Scanner;

public class A08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);

        if (Character.isLowerCase(first)) {
            System.out.println("lower-case");
        } else if (Character.isUpperCase(first)) {
            System.out.println("upper-case");
        }
    }
}
