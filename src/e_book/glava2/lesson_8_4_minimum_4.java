package e_book.glava2;

/**
 * Created by Alexandr on 07.10.2014.
 */
public class lesson_8_4_minimum_4 {
    public static void main(String[] args)
    {
        int a =5,b=7,c=3,d=6;
        int m1 = lesson_8_1_minimum.min(a,b);
        int m2 = lesson_8_1_minimum.min(c,d);
        int m = lesson_8_1_minimum.min(m1,m2);
        System.out.println("Minimum is " + m);
    }
}
