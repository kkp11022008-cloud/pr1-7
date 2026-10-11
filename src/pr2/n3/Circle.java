package pr2.n3;

public class Circle {
    private Point center;
    private double radius;
    public Circle(double x, double y, double radius) {
        center = new Point(x, y);
        this.radius = radius;
    }
    public Point getCenter() {
        return center;
    }
    public void setCenter(Point center) {
        this.center = center;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle{center=" + center + ", radius=" + radius + "}";
    }
}