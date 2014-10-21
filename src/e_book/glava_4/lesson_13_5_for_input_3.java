package e_book.glava_4;

import java.util.Scanner;

/**
 * Created by Alexandr on 21.10.2014.
 */
public class lesson_13_5_for_input_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for(int i = 1;i <10;i++)
            System.out.println(name + " love me");
    }
}
