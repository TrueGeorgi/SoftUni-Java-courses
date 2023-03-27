import java.util.Scanner;

public class A04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int finalNum = Integer.parseInt(scanner.nextLine());
int sum = 0;
        for (int i = startNum; i <= finalNum ; i++) {
            if (i == finalNum) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
            sum += i;
        }
        System.out.printf("Sum: %d", sum);
    }
}
