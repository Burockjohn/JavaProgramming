package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {

        int grade = 95;

        if(grade >= 0 && grade <= 100){ // if the grade is valid (0 ~ 100 )
            // 5 possibilities: A, B, C, D, F
            if(grade>= 90){ //false:  grade < 90
                System.out.println("Excellent");
            }else if(grade >= 80){ // false: grade < 80
                System.out.println("Great");
            }else if(grade >= 70){ // false: grade < 70
                System.out.println("Good");
            }else if(grade >= 60){// false: grade < 60
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{ // if the grade is NOT valid
            System.out.println("Invalid grade");
        }

        System.out.println("------------------------------------------");

        String result = (grade >= 0 && grade <= 100)? (grade>= 90)? "Excellent" :(grade >= 80)? "Great"
                :(grade >= 70)? "Good" :(grade >= 60)? "Passed" : "Failed": "Invalid Score";
        System.out.println("result = " + result);


    }
}
