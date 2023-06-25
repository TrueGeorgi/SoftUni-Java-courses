package AE06_Animals.animals;

public class Tomcat extends Cat{

    final static String sound = "MEOW";
    final static String type = "Tomcat";

    final static String gender = "Male";

    public Tomcat (String name, int age) {
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
