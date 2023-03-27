import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int min = Integer.MAX_VALUE;
        while (!input.equals("Stop")) {
            int numInput = Integer.parseInt(input);
            if (numInput < min) {
                min = numInput;
            }
            input = scanner.nextLine();
        }
        System.out.println(min);
    }
}
