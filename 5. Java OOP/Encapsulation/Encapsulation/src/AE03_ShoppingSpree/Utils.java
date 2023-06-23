package AE03_ShoppingSpree;

public class Utils {
    public boolean isEmptyName (String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("The name cannot be empty.");
        } else {
            return false;
        }
    }

    public boolean isNegativeNumber (double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot be a negative number");
        } else {
            return false;
        }
    }
}
