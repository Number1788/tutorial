package e_book.glava_4;

import java.util.Scanner;

/**
 * Created by Alexandr on 21.10.2014.
 */
public class lesson_16_2_sr_chislo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        sort(a,b,c);
    }

    public static void sort(int a,int b,int c){
        int d;
        if (a<b) {
            d = a;
            a=b;
            b=d;
        }
        if (b<c) {
            d = b;
            b=c;
            c=d;
        }
        if (a<b) {
            d = a;
            a=b;
            b=d;
        }
        System.out.println(b);




    }
}
