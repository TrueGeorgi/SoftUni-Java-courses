package AE06_Animals;

import AE06_Animals.animals.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animalType = scanner.nextLine();

        Map<String, Animal> animals = new LinkedHashMap<>();

        while (!animalType.equals("Beast!")) {
            String[] nameAgeGender = scanner.nextLine().split("\\s+");
            String name = nameAgeGender[0];
            int age = Integer.parseInt(nameAgeGender[1]);
            String gender = nameAgeGender[2];

            Animal animal;

            switch (animalType) {
                case "Cat":
                    animal = new Cat(name, age, gender);
                    break;
                case "Dog":
                    animal = new Dog(name, age, gender);
                    break;
                case "Frog":
                    animal = new Frog(name, age, gender);
                    break;
                case "Kitten":
                    animal = new Kitten(name, age);
                    break;
                case "Tomcat":
                    animal = new Tomcat(name, age);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid input!");
            }

            animals.put(animalType, animal);

            animalType = scanner.nextLine();
        }

        for (Map.Entry<String, Animal> animal : animals.entrySet()) {
            System.out.println(animal.getValue().toStringAnimal());
        }
    }
}
