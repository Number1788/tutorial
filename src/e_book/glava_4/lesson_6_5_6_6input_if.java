package e_book.glava_4;

import java.util.Scanner;

/**
 * Created by Alexandr on 17.10.2014.
 */
public class lesson_6_5_6_6input_if {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        result(name,age);
    }

    public static void result(String name,int age){
        if (age<18)
            System.out.println(name + " подрасти еще");
        else
            System.out.println(name + " проходи");
    }
}
