package day16_ForLoopAndStringPractices;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str1 = "AABBCCBC",
                result = "";

        for (int i = 0; i < str1.length(); i++) {

            String ch = "" + str1.charAt(i);
            if (!result.contains(ch)) {

                result += ch;
            }

        }

        System.out.println(result);

    }
}

/*

2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding

 */