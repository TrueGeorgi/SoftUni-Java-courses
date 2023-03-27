import java.util.Scanner;

public class A02_CommonElements_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");

        for (String elementTwo:input2) {
            for (String elementOne:input1) {
                if (elementTwo.equals(elementOne)) {
                    System.out.print(elementTwo + " ");
                    break;
                }
            }
        }
    }
}
