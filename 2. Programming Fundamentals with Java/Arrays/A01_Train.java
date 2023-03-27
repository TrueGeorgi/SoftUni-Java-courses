import java.util.Scanner;

public class A01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonsCount = Integer.parseInt(scanner.nextLine());
        int[] peopleInAWagon = new int[wagonsCount];
        int sum = 0;

        for (int i = 0; i < peopleInAWagon.length; i++) {
            peopleInAWagon[i] = Integer.parseInt(scanner.nextLine());
            if (i == peopleInAWagon.length - 1) {
                System.out.println(peopleInAWagon[i]);
            } else {
                System.out.print(peopleInAWagon[i] + " ");
            }
            sum += peopleInAWagon[i];
        }
        System.out.print(sum);
    }
}
