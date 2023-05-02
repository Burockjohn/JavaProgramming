package day09_IfStatements;

public class LeapYear {

    public static void main(String[] args) {


        int year = 2000;

        boolean isLeapYear = year % 4 == 0;

        if (isLeapYear) {
            System.out.println("Year " + year + " is a leap year");
        }

        else {
            System.out.println("Year " + year + " is NOT a leap year");
        }
    }
}
