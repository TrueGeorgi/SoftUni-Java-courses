package A03_SayHello;

public class Chinese implements Person {

    private String name;

    final String hello = "Ni hao";

    public Chinese (String name) {
        this.name = name;
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
