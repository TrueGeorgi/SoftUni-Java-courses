package AE06_Animals.animals;

public class Dog extends Animal {

    final static String sound = "Woof!";
    final static String type = "Dog";

    public Dog (String name, int age, String gender) {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    String produceSound() {
        return sound;
    }

    @Override
    public String toStringAnimal() {
        return String.format("%s%n" +
                        "%s %d %s%n" +
                        "%s"
                , type
                , name
                , age
                , gender
                , produceSound());
    }
}
