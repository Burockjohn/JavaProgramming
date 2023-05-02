package day23_CustomMethods_Void;

public class CustomMethodPractice {


    // crate a function that can print hello world 5 times ==> helloWorld5Times()
    public static void helloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }

    // create function that can print helle Cydeo 5 times ==> helloCydeo5Times()

    public static void helloCydeo5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }

    }

    public static void main(String[] args) {

        helloWorld5Times();
        System.out.println("----------------------------------------------------------------");
        helloCydeo5Times();
        System.out.println("----------------------------------------------------------------");
        evenNumbers();
    }

    public static void evenNumbers() {

        for (int i = 2; i < 11; i += 2) {
            System.out.println(i);
        }

    }

}