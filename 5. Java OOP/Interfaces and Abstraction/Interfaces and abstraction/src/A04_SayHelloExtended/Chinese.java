package A04_SayHelloExtended;

public class Chinese extends BasePerson {

    private String name;

    final String hello = "Ni hao";

    public Chinese (String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String sayHello() {
        return hello;
    }
}
