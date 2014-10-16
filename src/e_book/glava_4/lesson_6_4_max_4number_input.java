package e_book.glava_4;

import java.util.Scanner;

/**
 * Created by Alexandr on 16.10.2014.
 */
public class lesson_6_4_max_4number_input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int m = max(a,b,c,d);
        System.out.println(m);
    }

    public static int max(int a,int b,int c,int d){
        int m1,m2,maximum;
        if (a>b)
            m1=a;
        else
            m1=b;
        if (c>d)
            m2=c;
        else
            m2=d;
        if (m1>m2)
            maximum=m1;
        else
            maximum=m2;

        return maximum;
    }
}
