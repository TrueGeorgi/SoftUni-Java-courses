package A03_SayHello;

public class Bulgarian implements Person {

    final String hello = "Zdravei";

    private String name;

    public Bulgarian(String name) {
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
