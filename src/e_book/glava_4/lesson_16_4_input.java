package e_book.glava_4;

import java.util.Scanner;

/**
 * Created by Alexandr on 21.10.2014.
 */
public class lesson_16_4_input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int year = scanner.nextInt();
        int mounth = scanner.nextInt();
        int day = scanner.nextInt();
        System.out.println("My name is " + name);
        System.out.println("I born in " + day + "." + mounth + "." + year);
    }
}
