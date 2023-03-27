import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        while (!input.equals("Stop")) {
            int numInput = Integer.parseInt(input);
            if (numInput > max) {
                max = numInput;
            }
            input = scanner.nextLine();
        }
        System.out.println(max);
    }
}
