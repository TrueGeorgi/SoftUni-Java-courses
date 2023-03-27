import java.math.BigDecimal;
import java.util.Scanner;

public class A2_SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal input1 = new BigDecimal(scanner.nextLine());
        BigDecimal input2 = new BigDecimal(scanner.nextLine());
        BigDecimal sum = input1.add(input2);

        System.out.println(sum);


    }
}
