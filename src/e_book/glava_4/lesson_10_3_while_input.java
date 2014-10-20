package e_book.glava_4;

import java.util.Scanner;

/**
 * Created by Alexandr on 20.10.2014.
 */
public class lesson_10_3_while_input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        int a= scanner.nextInt();
        int i=0;
        while (i<a){
            System.out.println(st);
            i++;
        }
    }
}
