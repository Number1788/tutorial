package e_book.glava2;

/**
 * Created by Alexandr on 06.10.2014.
 */
public class lesson_8_3_minimum_3 {
    public static void main(String[] args)
    {
        int a =5,b=7,c=2;
        int m = min(a,b,c);
        System.out.println("Minimum is " + m);
    }

    public static int min(int c,int d,int e)
    {
        int m2;
        if (c < d)
            m2=c;
        else
            m2=d;
        if (m2>e)
            m2=e;

        return m2;
    }
}
