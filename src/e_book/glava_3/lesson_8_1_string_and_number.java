package e_book.glava_3;

import java.util.Scanner;

/**
 * Created by Alexandr on 10.10.2014.
 */
public class lesson_8_1_string_and_number {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println(name + " zahvati mir cherez " + age + " let.");
    }
}
