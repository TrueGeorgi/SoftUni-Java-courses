import com.sun.jdi.Value;

import java.math.BigDecimal;
import java.util.Scanner;

public class A03_BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int timesI = 1;
        BigDecimal result = BigDecimal.ONE;

        for (int i = 1; i <= input; i++) {
            result = result.multiply(new BigDecimal(i));
        }
        System.out.println(result);
    }
}
