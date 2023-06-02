package AE.FirstTask;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int spins = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        while (spins-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");

            String name = input[0];
            int age = Integer.parseInt(input[1]);

            people.add(new Person(name, age));
        }

        people.sort(Comparator.comparing(Person::getName));

       people = people.stream().filter(p -> p.getAge() > 30).collect(Collectors.toList());

        for (Person person : people) {
            System.out.printf("%s - %d%n", person.getName(), person.getAge());
        }
    }
}
