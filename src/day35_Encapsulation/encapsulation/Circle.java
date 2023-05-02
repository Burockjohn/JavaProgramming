package day35_Encapsulation.encapsulation;

public class Circle {

    private double radius;
    public static double pi = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.err.println("Invalid value");
            System.exit(0);
        }

        this.radius = radius;
    }

    public double calcArea() {
        return pi * radius * radius;
    }

    public double calcPerimeter() {
        return pi * radius * 2;
    }

    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                ", area of the circle is = " + calcArea() +
                ", perimeter of the circle is = " + calcPerimeter() +
                '}';
    }
}

/*

2. Create a class named Circle

			private variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the radius of circle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()

 */