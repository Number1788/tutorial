package e_book.glava2;

/**
 * Created by Alexandr on 06.10.2014.
 */
public class lesson_7_1_minimum {
    public static void main(String[] args)
    {
        int a =5,b=7;
        int m = min(a,b);
        System.out.println("Minimum is " + m);
    }

    public static int min(int c,int d)
    {
        int m2;
        if (c < d)
            m2=c;
        else
            m2=d;

        return m2;
    }
}
