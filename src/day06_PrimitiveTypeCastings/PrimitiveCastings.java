package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b = a;

        //short b = (short) a;
        //         (short) a

        int c = b;
        //int c = (int)b --> compiler runs background, implicit casting

        long d = c;
        //int e= d; --> it can not be casted directly or implicitly
        float e = d;
        double f = e;

        int x = 55;
        short y = (short)x; // explicit casting;

        System.out.println(x + " : " + y);

        long j = 1_000_000;
        short k = (short) j;

        System.out.println(j + " : " + k); //1.000.000 is not within the range of "short", so the result is inconsistent.

        double l = 2.5;
        float m = (float) l;
        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int) n; // ---> you can do in this way, but there is no need ---> (int)(long) n;
        // it prints just 10 because of that integer is 10, not 10.8
        System.out.println(n +" : " + s);




    }

}
