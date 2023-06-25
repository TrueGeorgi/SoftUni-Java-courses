package AE06_Animals.animals;

public class Kitten extends Cat {

    final static String sound = "Meow";
    final static String type = "Kitten";

    final static String gender = "Female";

    public Kitten (String name, int age) {
        super(name, age, gender);
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
