package A02_PointInRectangle;

public class Rectangle {

    Point bottomLeft;

    Point topRight;

    public Rectangle(Point bottomLeft, Point bottomRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = bottomRight;
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public boolean contains (Point point) {
        boolean bottomFits = point.getX() >= this.bottomLeft.getX() && point.getY() >= this.bottomLeft.getY();
        boolean topFits = point.getX() <= this.topRight.getX() && point.getY() <= this.topRight.getY();

        return topFits && bottomFits;
    }
}
