package AE06_Animals.animals;

public class Animal {

    String sound;

    private String type;

    String name;
    String gender;
    int age;

    protected Animal() {

    }

    String produceSound() {
        return sound;
    }

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
