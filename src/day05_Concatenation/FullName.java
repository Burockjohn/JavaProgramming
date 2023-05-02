package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String first_name = "Burak";
        String last_name = "Can";
        int age = 36;
        String job_title = "Senior Specialist";
        String company_name = "Turk Telekom";
        double salary = 40_000.88;

        String full_name = first_name + " " + last_name;

        //System.out.println(full_name);

        //Full name of the person is ________

        System.out.println("Full name of the person is " + full_name);

        //___ is ____ years old.

        System.out.println(full_name + " is " + age + " years old.");

        //Full name is job_title, works at company_name, and Full Name's salary is Salary

        System.out.println(full_name + " is " + job_title + ", works at " + company_name + ", and " + full_name
                + "'s salary is " + salary);


    }


}
