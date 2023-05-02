package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String students[] = {"Burak Can", "Yunus Kulcu", "Burak Yılmaz", "Tuğba T.", "Recep Çavuşoğlu", "Çağlar Smyrna"};

        for (String each : students) {
            System.out.println(each.charAt(0) + "." + each.charAt(each.indexOf(" ") + 1));
        }

    }
}
