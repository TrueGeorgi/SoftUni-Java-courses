package TaskOne;

public class Main {
    public static void main(String[] args) {

     Jar<String> cars = new Jar<>();

     cars.add("Audi");
     cars.add("Ford");
     cars.add("BMW");
     cars.add("VW");

        System.out.println(cars.remove());

    }
}
