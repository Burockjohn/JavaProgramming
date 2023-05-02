package day17_While_DoWHile;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your user name");
        String user = input.next();

        System.out.println("Enter your password");
        String pass = input.next();

        if (user.equals("Cydeo") && pass.equals("Cydeo123")) { // if credentials are valid
            System.out.println("Logged in");
        } else {
            int attempt = 3;

            while (!(user.equals("Cydeo") && pass.equals("Cydeo123")) && attempt > 0) {  //while the credentials are invalid, and user has attempts to reenter

                System.out.println("Incorrect username or password, please re-enter");

                if (attempt == 1) {
                    System.out.println("This is your last chance"); };

                System.out.println("Enter your username");
                user = input.next();
                System.out.println("Enter your password");
                pass = input.next();
                attempt--;
            }
            if (user.equals("Cydeo") && pass.equals("Cydeo123")) {
                System.out.println("Logged in");
            } else {
                System.out.println("Your account is locked");
            }
        }

        input.close();


    }
}

/*

2. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."


 */