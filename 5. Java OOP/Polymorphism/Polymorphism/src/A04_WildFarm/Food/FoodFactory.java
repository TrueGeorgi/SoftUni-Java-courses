package A04_WildFarm.Food;

public class FoodFactory {

    public static Food crateFood(String input) {

        Food food = null;

        switch (input.toLowerCase()) {
            case "vegetable":
                food = new Vegetable();
                break;
            case "meat":
                food = new Meat();
                break;
        }

        return food;
    }
}
