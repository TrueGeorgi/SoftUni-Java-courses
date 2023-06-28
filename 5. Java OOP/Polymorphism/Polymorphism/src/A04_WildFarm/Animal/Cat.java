package A04_WildFarm.Animal;

import A04_WildFarm.Food.Food;
import A04_WildFarm.Food.Meat;

import java.text.DecimalFormat;

public class Cat extends Feline {

    String breed;

    public Cat(String type, String name, Double weight, String livingRegion, String breed) {
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.livingRegion = livingRegion;
        this.breed = breed;
    }

    @Override
    public void madeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food, int quantity) {
            this.foodEaten = quantity;
    }

    @Override
    boolean isEatable(Food food) {
        if (food instanceof Meat) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#.##");
        format.setDecimalSeparatorAlwaysShown(false);
        String formattedWeight = format.format(this.weight);
        return String.format("%s[%s, %s, %s, %s, %d]", type, name, breed, formattedWeight, livingRegion, foodEaten);
    }
}
