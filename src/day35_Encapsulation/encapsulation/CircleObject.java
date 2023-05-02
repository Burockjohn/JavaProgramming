package day35_Encapsulation.encapsulation;

public class CircleObject {

    public static void main(String[] args) {

        Circle circle1 = new Circle(4);
        System.out.println(circle1.getRadius());
        circle1.setRadius(3.5);

        System.out.println(circle1);

    }
}
