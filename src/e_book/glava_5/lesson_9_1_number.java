package e_book.glava_5;

import java.util.Scanner;

/**
 * Created by Alexandr on 04.03.2015.
 */
public class lesson_9_1_number {
    static int number(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i;
    }

    public static void main(String[] args){
        System.out.print(number());

    }
}
