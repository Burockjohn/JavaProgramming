package day43_Abstraction.shapeTask;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                " area=' " + area() + '\'' +
                " perimeter=' " + perimeter() + '\'' +
                '}';
    }
}
