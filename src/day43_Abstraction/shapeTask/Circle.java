package day43_Abstraction.shapeTask;

public class Circle extends Shape {

    private static final double pi = 3.14;
    private double radius;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " area=' " + area() + '\'' +
                " perimeter=' " + perimeter() + '\'' +
                '}';
    }
}
