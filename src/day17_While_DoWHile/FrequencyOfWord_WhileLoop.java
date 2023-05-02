package day17_While_DoWHile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Python Python";
        int frequency = 0;

        while (str.contains("Java")) {
            str = str.replaceFirst("Java", "");
            frequency++;
        }

        System.out.println("frequency = " + frequency);

        System.out.println("-".repeat(60));

        String sentence = "cat dog cat dog cat dog cat dog cat cat dog cat dog dog cat";
        sentence = sentence.toLowerCase();
        int countCat = 0,
                countDog = 0;

        while (sentence.contains("cat") || sentence.contains("dog")) {

            if (sentence.contains("cat")) {
                sentence = sentence.replaceFirst("cat", "");
                countCat++;
            } else if (sentence.contains("dog")) {
                sentence = sentence.replaceFirst("dog", "");
                countDog++;

            }

        }

        System.out.println("counter = " + countCat);
        System.out.println("countDog = " + countDog);

    }
}
