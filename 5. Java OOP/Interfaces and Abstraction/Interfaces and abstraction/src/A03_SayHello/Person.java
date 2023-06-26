package A03_SayHello;

public interface Person {

    final String hello = "Hello";

    String getName();
    default String sayHello() {
      return hello;
    }
}
