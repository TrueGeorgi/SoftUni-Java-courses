package AE.SeventhTask;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Person> people = new LinkedHashMap<>();

        while (!command.equals("End")) {

            String name = command.split("\\s+")[0];

            if (!people.containsKey(name)) {
                people.put(name, new Person(name));
            }

            String action = command.split("\\s+")[1];

            switch (action) {
                case "company":
                    String companyName = command.split("\\s+")[2];
                    String department = command.split("\\s+")[3];
                    double salary = Double.parseDouble(command.split("\\s+")[4]);
                    people.get(name).setCompany(new Company(companyName, department, salary));
                    break;
                case "pokemon":
                    String pokemonName = command.split("\\s+")[2];
                    String type = command.split("\\s+")[3];
                    people.get(name).addPokemon(new Pokemon(pokemonName, type));
                    break;
                case "parents":
                    String parentName = command.split("\\s+")[2];
                    String parentBirthday = command.split("\\s+")[3];
                    people.get(name).addParent(new Parent(parentName, parentBirthday));
                    break;
                case "children":
                    String childName = command.split("\\s+")[2];
                    String childBirthday = command.split("\\s+")[3];
                    people.get(name).addChild(new Child(childName, childBirthday));
                    break;
                case "car":
                    String model = command.split("\\s+")[2];
                    int speed = Integer.parseInt(command.split("\\s+")[3]);
                    people.get(name).setCar(new Car(model, speed));
                    break;
            }

            command = scanner.nextLine();
        }

        String outputName = scanner.nextLine();

        System.out.println(people.get(outputName).toString());
    }
}
