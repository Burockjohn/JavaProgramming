package day52_Map_FunctionalInterface;

// lambda: () -> {}

public class Test {

    public static void main(String[] args) {

        // function1: create a function that can display a number is odd or even
        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> {
            if (n % 2 == 0) {
                System.out.println(n + " is even number");
            } else {
                System.out.println(n + " is odd number");
            }
        };

        oddOrEvenNumber.apply(8);

        // function2: create a function that can check if a person is eligible to buy cigarettes
        MyFirstFunctionalInterface isEligibleToBuyCigarette = (n) -> {
            if (n < 18) {
                System.out.println("He/She is not eligible to buy cigarette");
            } else {
                System.out.println("He/She is eligible to buy cigarette");
            }
        };

        isEligibleToBuyCigarette.apply(18);

        // function3: create a function that can display the cub of a number
        MyFirstFunctionalInterface cubeOfNumber;
        cubeOfNumber= n -> System.out.println("The cube of " + n + " is: " + (n * n * n));


        cubeOfNumber.apply(4);

        //function4: create a function that can check if a number is evenly divisible by  3 & 5
        MyFirstFunctionalInterface divisibleBy3And5 =  n -> {
            if(n % 15 ==0){
                System.out.println(n+" is divisible by 3 and 5");
            }else{
                System.out.println(n+" is not divisible by 3 and 5");
            }
        };

        divisibleBy3And5.apply(30);

    }
}
