package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

            //hourlyRate, weeklyHours

        int hourlyRate = 65;
        int weeklyHours = 40;
        int numberOfWeeks = 52;

        int salary = hourlyRate * weeklyHours * numberOfWeeks;

        //System.out.println(salary);

        System.out.println("weeklyHours =" + hourlyRate + " $");
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = " + salary + " $");



    }


}
