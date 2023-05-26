import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class A05_FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> people = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            people.put(name,age);
        }

        String condition = scanner.nextLine();
        int ageComparator = Integer.parseInt(scanner.nextLine());
        String outputCondition = scanner.nextLine().replace(" ", "");

        for (Map.Entry<String, Integer> person : people.entrySet()) {
            switch (condition) {
                case "older":
                    if (person.getValue() >= ageComparator) {
                        print(outputCondition, person.getKey(), person.getValue());
                    }
                    break;
                case "younger":
                    if (person.getValue() <= ageComparator) {
                        print(outputCondition, person.getKey(), person.getValue());
                    }
                    break;
            }
        }
    }

    public static void print (String outputCondition, String name, int age) {
        switch (outputCondition) {
            case "name":
                System.out.println(name);
                break;
            case "age":
                System.out.println(age);
                break;
            default:
                System.out.println(name + " - " + age);

        }
    }
}
