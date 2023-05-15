package day45_Abstraction.shapeTask;

public class Cube extends Shape implements Volume{


    public Cube() {
        super("Cube");
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }


    @Override
    public double volume() {
        return 0;
    }
}