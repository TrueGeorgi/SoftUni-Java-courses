package A03_Animals;

public class Dog extends Animal {

    public Dog(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    @Override
    String explainSelf() {
        return String.format("I am %s and my favourite food is %s%nDJAAF", this.name, this.favoriteFood);
    }
}
