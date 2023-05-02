package day04_Variables;

public class Circle {

    public static void main(String[] args) {

        double radius = 3;

        double pi = 3.14;
        double diameter = 2 * radius; //finds the diameter by multiplying the radius to 2
        double area = radius * radius * pi;
        double perimeter = diameter * pi;

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }


}
