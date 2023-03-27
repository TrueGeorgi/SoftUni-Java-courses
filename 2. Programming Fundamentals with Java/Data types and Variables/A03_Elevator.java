import java.util.Scanner;

public class A03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = people / capacity;
        if (courses * capacity != people) {
            courses++;
        }
        System.out.println(courses);
    }
}
