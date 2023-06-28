package A04_WildFarm.Animal;

import A04_WildFarm.Food.Food;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    String livingRegion;

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#.##");
        format.setDecimalSeparatorAlwaysShown(false);
        String formattedWeight = format.format(this.weight);
        return String.format("%s[%s, %s, %s, %d]", type, name, formattedWeight, livingRegion, foodEaten);
    }

    @Override
    public void madeSound() {

    }
}
