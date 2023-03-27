import java.text.DecimalFormat;
import java.util.Scanner;

public class AE03_FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double eps = 0.000001;
       double first = Double.parseDouble(scanner.nextLine());
       double second = Double.parseDouble(scanner.nextLine());
       String equal = "False";
       if (Math.abs(first - second) < eps) {
           equal = "True";
       }
        System.out.println(equal);
    }
}
