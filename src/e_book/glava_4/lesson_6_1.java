package e_book.glava_4;

import java.util.Scanner;

/**
 * Created by Alexandr on 16.10.2014.
 *
 * minimum from 2 numbers
 */
public class lesson_6_1 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m= min(a,b);
        System.out.println(m);
    }

    public static int min(int a,int b){
        int min;
        if (a<b)
            min=a;
        else
        min = b;
        return min;
    }
}
