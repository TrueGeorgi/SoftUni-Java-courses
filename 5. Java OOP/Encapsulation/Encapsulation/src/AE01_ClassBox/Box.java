package AE01_ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {

        sideValidation(length, "Length");

        this.length = length;
    }

    private void setWidth(double width) {
        sideValidation(width, "Width");

        this.width = width;
    }

    private void setHeight(double height) {
        sideValidation(height, "Height");

        this.height = height;
    }

    public double calculateSurfaceArea () {
        return 2 * (length * width) + 2 * (length * height) + 2 * (width * height);
    }

    public double calculateLateralSurfaceArea() {
        return 2 * (length * height) + 2 * (width * height);
    }

    public double calculateVolume () {
        return length * width * height;
    }

    private static void sideValidation(double length, String side) {
        if (length <= 0) {
            throw new IllegalArgumentException(side + " cannot be zero or negative.");
        }
    }
}
