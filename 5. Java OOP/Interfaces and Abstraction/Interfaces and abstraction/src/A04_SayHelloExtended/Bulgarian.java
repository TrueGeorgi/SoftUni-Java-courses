package A04_SayHelloExtended;

public class Bulgarian extends BasePerson {

    final String hello = "Zdravei";

    private String name;

    public Bulgarian(String name) {
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
