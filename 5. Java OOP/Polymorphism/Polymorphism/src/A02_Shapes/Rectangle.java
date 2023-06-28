package A02_Shapes;

public class Rectangle extends Shape{

    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    @Override
    Double calculatePerimeter() {
        return 2 * (getHeight() + getWidth());
    }

    @Override
    Double calculateArea() {
        return getHeight() * getWidth();
    }
}
