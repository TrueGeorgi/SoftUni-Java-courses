import java.util.Scanner;

public class AE05_MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String num1 = scanner.nextLine();
       String num2 = scanner.nextLine();
       String num3 = scanner.nextLine();
       String sum = num1+num2+num3;

       if (num1.equals("0") || num2.equals("0") || num3.equals("0")) {
           System.out.println("zero");
       } else {
           int timesMinus = 0;

           for (int i = 0; i < sum.length(); i++) {
               char currentChar = sum.charAt(i);
               if (currentChar == '-') {
                   timesMinus++;
               }
           }

           if (timesMinus % 2 == 0) {
               System.out.println("positive");
           } else {
               System.out.println("negative");
           }
       }
    }
}
