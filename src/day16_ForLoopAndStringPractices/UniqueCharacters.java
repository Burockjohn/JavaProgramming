package day16_ForLoopAndStringPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str1 = "AABCCD",
                result = "";

        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);

            if (str1.indexOf(ch) == str1.lastIndexOf(ch)) {
                result += ch;
            }
        }

        System.out.println(result);

    }
}

/*

3. Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique



				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1


				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2

 */