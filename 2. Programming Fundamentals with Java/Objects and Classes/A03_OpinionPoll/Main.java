package A03_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int spins = Integer.parseInt(scanner.nextLine());
        List<Person> peoplesList = new ArrayList<>();

        for (int i = 1; i <= spins; i++) {
            String input = scanner.nextLine();
            String name = input.split("\\s+")[0];
            int age = Integer.parseInt(input.split("\\s+")[1]);
            Person person = new Person(name, age);
            peoplesList.add(person);
        }
        for (Person person:peoplesList) {
            if (person.getAge() > 30) {
                System.out.println(person);
            }
        }
    }
}
