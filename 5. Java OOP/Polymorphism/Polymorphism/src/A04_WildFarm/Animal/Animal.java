package A04_WildFarm.Animal;

import A04_WildFarm.Food.Food;

public abstract class Animal {
    String name;
    String type;
    Double weight;
    Integer foodEaten = 0;

   public abstract void madeSound();
   public abstract void eat(Food food, int quantity); //Food

    abstract boolean isEatable(Food food);
}
