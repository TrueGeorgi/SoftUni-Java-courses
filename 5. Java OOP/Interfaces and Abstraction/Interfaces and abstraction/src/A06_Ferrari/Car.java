package A06_Ferrari;

public interface Car {

    default String brakes() {
        return "Brakes!";
    }

    default String gas() {
        return "brum-brum-brum-brrrrr";
    }
}
