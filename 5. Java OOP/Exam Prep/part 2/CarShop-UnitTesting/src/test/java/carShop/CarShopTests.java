package carShop;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class CarShopTests {
    private CarShop carShop;
    private Car car;

    @Before
    public void setUp() {
        carShop = new CarShop();
        car = new Car("BMW", 231, 15000);
        carShop.add(car);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void whenGetCarsReturnUnmodifiableList() {
        carShop.getCars().set(0, car);
    }

    @Test
    public void whenGetCarsReturnsTheCarsList() {
        List<Car> cars = carShop.getCars();

        Assert.assertEquals(1, cars.size());
    }

    @Test
    public void returnsTheCorrectSize() {
        int carsCount = carShop.getCount();

        Assert.assertEquals(1, carsCount);

    }

    @Test
    public void returnsOnlyTheCarsFasterThanTheGiveHorsePower() {
        Car ford = new Car("Ford", 140, 1400.23);
        Car dacia = new Car("Dacia", 182, 1102.43);
        Car greatWall = new Car("Great Wall", 215, 3414.77);

        carShop.add(ford);
        carShop.add(dacia);
        carShop.add(greatWall);

        List<Car> resultCars = carShop.findAllCarsWithMaxHorsePower(190);
        List<Car> expectedCars = List.of(car, greatWall);

        Assert.assertEquals(resultCars, expectedCars);

    }

    @Test
    public void addsNewCarSuccessfully () {
        Car ford = new Car("Ford", 140, 1400.23);
        carShop.add(ford);

        Assert.assertEquals(2, carShop.getCars().size());
    }

    @Test (expected = NullPointerException.class)
    public void ifNewCarIsNullThrowsNullPointerException () {
        Car ford = null;
        carShop.add(ford);
    }

    @Test
    public void successfullyRemovesCarFromTheList () {
        carShop.remove(car);

        Assert.assertEquals(0, carShop.getCars().size());
    }

    @Test
    public void returnsTheMostExpensiveCar () {
        Car ford = new Car("Ford", 140, 1400.23);
        Car dacia = new Car("Dacia", 182, 50102.43);
        Car greatWall = new Car("Great Wall", 215, 3414.77);

        carShop.add(ford);
        carShop.add(dacia);
        carShop.add(greatWall);

        Car luxuryCar = carShop.getTheMostLuxuryCar();
        Assert.assertEquals(luxuryCar, dacia);
    }

    @Test
    public void returnsOnlyCarsFromTheGivenModel () {
        Car ford = new Car("Ford", 140, 1400.23);
        Car dacia = new Car("Dacia", 182, 50102.43);
        Car greatWall = new Car("Great Wall", 215, 3414.77);
        Car dacia2 = new Car("Dacia", 189, 13566.91);

        carShop.add(ford);
        carShop.add(dacia);
        carShop.add(greatWall);
        carShop.add(dacia2);

        List<Car> outcome = carShop.findAllCarByModel("Dacia");
        List<Car> expectedOutcome = List.of(dacia, dacia2);

        Assert.assertEquals(outcome, expectedOutcome);
    }
}

