package FirstStepsLab;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Име, Фамилия, Възраст и град
        //You are <firstName> <lastName>, a <age>-years old person from <town>.
        String name = scanner.nextLine();
        String familyName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String city = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", name, familyName, age, city);
    }
}
