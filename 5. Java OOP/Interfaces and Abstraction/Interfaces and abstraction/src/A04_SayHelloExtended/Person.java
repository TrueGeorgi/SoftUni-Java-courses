package A04_SayHelloExtended;

public interface Person {

    final String hello = "Hello";

    String getName();
    default String sayHello() {
      return hello;
    }
}
