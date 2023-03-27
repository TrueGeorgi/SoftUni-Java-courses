import java.util.Scanner;

public class A05_MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().replaceFirst("^0+(?!$)", "");
        ;
        if (!input.equals("0") && !input.isEmpty()) {
            if (input.contains("-")) {
                input = input.replace("-", "");
            }
            int times = Integer.parseInt(scanner.nextLine());
            if (times != 0) {
                String output = "";
                int zeroOne = 0;
                for (int i = input.length() - 1; i >= 0; i--) {
                    int currentInt = Integer.parseInt(String.valueOf(input.charAt(i)));
                    if (currentInt != 0) {
                        int result = currentInt * times + zeroOne;
                        if (result > 9) {
                            zeroOne = Integer.parseInt(String.valueOf(result).substring(0, 1));
                            result = Integer.parseInt(String.valueOf(result).substring(1));
                            ;
                        } else {
                            zeroOne = 0;
                        }
                        output = result + output;
                    } else {
                        int result = currentInt + zeroOne;
                        output = result + output;
                    }
                }
                if (zeroOne >= 1) {
                    output = zeroOne + output;
                }
                System.out.println(output);
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(0);
        }
    }
}
