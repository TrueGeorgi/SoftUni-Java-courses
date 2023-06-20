import java.util.Scanner;

public class A01_RhombusOfStars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println(returnRow(n, i));
        }

        for (int i = n-1; i >= 1 ; i--) {
            System.out.println(returnRow(n, i));
        }
    }

    public static String returnRow (int main, int row) {
        String output = "";
        int difference = main - row;

        for (int j = 1; j <= difference; j++) {
            output += " ";
        }

        for (int i = 0; i < row; i++) {
            output += "* ";
        }

        return output;
    }
}
