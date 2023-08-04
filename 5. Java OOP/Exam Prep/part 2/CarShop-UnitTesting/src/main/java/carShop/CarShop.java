package carShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CarShop {

    private List<Car> cars;

    public CarShop() {
        this.cars = new ArrayList<>();
    }

    //TODO cannot change unmodifiable list // Done

    //TODO returns the list // Done
    public List<Car> getCars() {
        return Collections.unmodifiableList(this.cars);
    }

    //TODO returns correct size // Done
    public int getCount() {
        return this.cars.size();
    }

    //TODO returns only the cars above the given horsepower // Done
    public List<Car> findAllCarsWithMaxHorsePower(int horsePower) {
        List<Car> cars = this.cars.stream().filter(c -> c.getHorsePower() > horsePower).collect(Collectors.toList());

        return cars;
    }
    //TODO added successfully // Done
    //TODO throws an exception // Done
    public void add(Car car) {
        if (car == null) {
            throw new NullPointerException("Car cannot be null.");
        }

        this.cars.add(car);
    }
    //TODO removes a car from the list // Done
    public boolean remove(Car car) {
        return this.cars.remove(car);
    }

    //TODO returns the most expensive car // Done
    public Car getTheMostLuxuryCar() {
        Car car = this
                .cars
                .stream()
                .sorted((c1, c2) -> Double.compare(c2.getPrice(), c1.getPrice()))
                .limit(1)
                .findFirst()
                .orElse(null);

        return car;
    }

    //TODO returns a list of cars that are of the given model

    public List<Car> findAllCarByModel(String model) {
        List<Car> cars = this.cars.stream().filter(c -> c.getModel().equals(model)).collect(Collectors.toList());

        return cars;
    }
}