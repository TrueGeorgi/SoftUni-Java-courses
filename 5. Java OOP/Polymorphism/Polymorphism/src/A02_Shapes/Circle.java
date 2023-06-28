package A02_Shapes;

public class Circle extends Shape {

    private Double radius;

    public final Double getRadius() {
        return radius;
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    Double calculatePerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    Double calculateArea() {
        return Math.PI * (getRadius() * getRadius());
    }
}
