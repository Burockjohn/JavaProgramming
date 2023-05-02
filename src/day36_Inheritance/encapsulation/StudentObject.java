package day36_Inheritance.encapsulation;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Daniel", "MIT", 'M', 'D', 29);
        student1.setAge(36);
        System.out.println(student1);

    }
}
