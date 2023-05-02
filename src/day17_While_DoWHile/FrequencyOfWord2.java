package day17_While_DoWHile;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        String sentence = "Cat Dog Cat Dog cat cAT cAT",
                word = "Java";
        int frequency = 0;

        for (int i = 0; i <= sentence.length() - 3; i++) {

            if (sentence.substring(i, 3 + i).equalsIgnoreCase("cat")) {
                frequency++;
            }

        }

        System.out.println("frequency = " + frequency);


    }
}
