package day46_Polymorphism;

import day38_Inheritance.BMW;
import day38_Inheritance.Car;
import day38_Inheritance.Tesla;
import day38_Inheritance.Toyota;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CarTask {
    public static void main(String[] args) {

        Car[] cars = {
                new Toyota("Highlander", 2010, 25000, "White", 255000),
                new Toyota("Camry", 2018, 30000, "Red", 185000),
                new Toyota("Rav4", 2012, 23000, "Red", 285000),
                new Toyota("Avalon", 2019, 35000, "Blue", 175230),
                new Toyota("Corolla", 2011, 20000, "White", 310000),
                new BMW("M3", 2015, 33000, "Blue", 14030),
                new BMW("M5", 2017, 35000, "Black", 15000),
                new BMW("M4", 2018, 40000, "White", 19000),
                new BMW("7 Series", 2009, 30000, "Purple", 21000),
                new BMW("i3", 2011, 30000, "Black", 9000),
                new BMW("X5", 2014, 32000, "Red", 12000),
                new Tesla("Model 3", 2015, 45000, "White", 235000),
                new Tesla("Model Y", 2017, 65000, "Black", 135000),
                new Tesla("Model X", 2016, 48000, "White", 235000),
                new Tesla("Model X", 2014, 48000, "White", 236000),
        };

        //*********************************************************************************************************//
// 1.2 Write a program that can display all the cars that are eligible for recall

        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(cars));

        carList.removeIf(p -> p.brand.equals("Toyota") && p.year == 2010 && p.year == 2011);
        carList.removeIf(p -> p.brand.equals("BMW") && p.year < 1929 && p.year > 2022);
        carList.removeIf(p -> p.brand.equals("Tesla") && p.year == 2015 && p.year == 2016);

        System.out.println("\nCars that are eligible for recall;");

        for (Car each : carList) {
            System.out.println("\t(" + each.year + ") " + each.brand + "\t" + each.model);
        }
        System.out.println("------------------------------------------------------------------");

        //*********************************************************************************************************//
// 1.3 Write a program that can display the car that has the highest mileage
        int highestMilage = 0, lowestMilage = 0, year = 0;
        String brand = "", model = "";

        for (Car each : cars) {
            if (each.miles > highestMilage) {
                highestMilage = each.miles;
                brand = each.brand;
                model = each.model;
                year = each.year;
            }
        }
        System.out.println(brand + "-" + model + " (" + year + ") has the highest mileage with " + highestMilage);

        System.out.println("------------------------------------------------------------------");

//*********************************************************************************************************//
// 1.3 Write a program that can display the car that has the lowest mileage

        lowestMilage = highestMilage; // set to possible max value to compare

        for (Car each : cars) {
            if (each.miles < lowestMilage) {
                lowestMilage = each.miles;
                brand = each.brand;
                model = each.model;
                year = each.year;
            }
        }
        System.out.println(brand + "-" + model + " (" + year + ") has the lowest mileage with " + lowestMilage);

        System.out.println("------------------------------------------------------------------");

        //****************************************** SOLUTION 2 ************************************************//

        Car max = Collections.max(carList, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Integer.compare(o1.miles, o2.miles);
            }
        });
        System.out.println("\nThe car that has the highest mileage is;");
        System.out.println(max);

        System.out.println("------------------------------------------------------------------");

        Car min = Collections.min(carList, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Integer.compare(o1.miles, o2.miles);
            }
        });
        System.out.println("\nThe car that has the lowest mileage is;");
        System.out.println(min);


    }

}