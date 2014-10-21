package e_book.glava_4;

import java.util.Scanner;

/**
 * Created by Alexandr on 21.10.2014.
 */
public class lesson_16_3_summa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a,summ=0;
        while (true){
            a= scanner.nextInt();
            summ+=a;
            if (a==-1) break;
        }
        System.out.println(summ);
    }
}
