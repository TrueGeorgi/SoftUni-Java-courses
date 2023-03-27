import java.util.ArrayDeque;
import java.util.Scanner;

public class A03_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> binary = new ArrayDeque<>();
        if (input == 0) {
            System.out.println(0);
        } else {
            while (input != 0) {
                binary.push(input % 2);
                input /= 2;
            }
        }
        while (!binary.isEmpty()) {
            System.out.print(binary.pop());
        }
    }
}
