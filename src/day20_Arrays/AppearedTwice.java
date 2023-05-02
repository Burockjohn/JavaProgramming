package day20_Arrays;

public class AppearedTwice {

    public static void main(String[] args) {

        String result = "";

        char[] chars = {'A', 'A', 'A', 'B', 'C', 'C', 'D', 'D', 'D'};

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int counter = 0;

            for (int j = 0; j < chars.length; j++) {
                if (ch == chars[j]) counter++;
            }

            if (counter == 2) {
                if (result.contains("" + ch)) continue;
                result += ch;
            }
        }

        System.out.println(result);

    }
}
