package A04_WildFarm;

import A04_WildFarm.Animal.*;
import A04_WildFarm.Food.Food;
import A04_WildFarm.Food.FoodFactory;
import A04_WildFarm.Food.Meat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animalInput = scanner.nextLine();
        String foodInput = scanner.nextLine();

        Mammal mammal = null;

        while (!animalInput.equals("End") || !foodInput.equals("End")) {
            String[] animalInputArray = animalInput.split("\\s+");
            String[] foodInputArray = foodInput.split("\\s+");

            String animalType = animalInputArray[0];
            String name = animalInputArray[1];
            double weight = Double.parseDouble(animalInputArray[2]);
            String livingRegion = animalInputArray[3];

            String foodType = foodInputArray[0];

            int quantity = Integer.parseInt(foodInputArray[1]);

            switch (animalType) {
                case "Cat":
                    String breed = animalInputArray[4];
                    mammal = new Cat(animalType, name, weight, livingRegion, breed);
                    break;
                case "Tiger":
                    mammal = new Tiger(animalType, name, weight, livingRegion);
                    break;
                case "Mouse":
                    mammal = new Mouse(animalType, name, weight, livingRegion);
                    break;
                case "Zebra":
                    mammal = new Zebra(animalType, name, weight, livingRegion);
                    break;
            }

            assert mammal != null;

            mammal.madeSound();

            mammal.eat(FoodFactory.crateFood(foodType), quantity);

            animalInput = scanner.nextLine();
            if (animalInput.equals("End")) {
                break;
            }
            foodInput = scanner.nextLine();
        }

        System.out.println(mammal);
    }
}
