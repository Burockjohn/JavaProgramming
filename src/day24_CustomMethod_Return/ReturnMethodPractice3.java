package day24_CustomMethod_Return;

public class ReturnMethodPractice3 {

    public static void main(String[] args) {

        String str = "aabccdee";

        for (int i = 0; i < str.length(); i++) {

            int frequency = frequency(str, str.charAt(i));

            if(frequency == 1){
                System.out.println(str.charAt(i)); // unique characters
            }

        }


    }

    public static int frequency(String word, char ch) {

        int count = 0;

        for (char each : word.toCharArray()) {
            if (each == ch) {
                count++;
            }

        }

        return count;

    }
}
