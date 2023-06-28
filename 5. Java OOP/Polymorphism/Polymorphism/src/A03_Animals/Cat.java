package A03_Animals;

public class Cat extends Animal {

    public Cat(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    @Override
    String explainSelf() {
        return String.format("I am %s and my favourite food is %s%nMEEOW", this.name, this.favoriteFood);
    }
}
