package e_book.glava_5;

import java.util.Scanner;

/**
 * Created by Alexandr on 04.03.2015.
 */
public class lesson_9_1_number {

    static int number(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite kolijestvo");
        int i = scanner.nextInt();
        return i;
    }

    static int[] aray_number(int i){
        Scanner scanner = new Scanner(System.in);
        int[] array;
        array = new int[i];
        for(int j=0;j<i;j++) {
            System.out.println("Vvedite chislo " + j);
            array[j] = scanner.nextInt();
        }
        return array;
    }

    public static void main(String[] args){

        int[] array1 = aray_number(number());


    }
}
