package A04_WildFarm.Animal;

import A04_WildFarm.Food.Food;
import A04_WildFarm.Food.Vegetable;

public class Mouse extends Mammal {

    public Mouse(String type, String name, Double weight, String livingRegion) {
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.livingRegion = livingRegion;
    }

    @Override
    public void madeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food, int quantity) {
        if (isEatable(food)) {
            this.foodEaten = quantity;
        } else {
            System.out.println(this.type + " are not eating that type of food!");
        }
    }

    @Override
    boolean isEatable(Food food) {
        if (food instanceof Vegetable) {
            return true;
        }
        return false;
    }
}
