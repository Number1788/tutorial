package e_book.glava_4;

import java.util.Scanner;

/**
 * Created by Alexandr on 17.10.2014.
 */
public class lesson_6_4_string_equals {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string1= scanner.nextLine();
        String string2= scanner.nextLine();
        System.out.println(result(string1,string2));
    }

    public static String result(String s1,String s2){
        String r=" ";
        if (s1.equals(s2))
             r="строки равны";
        else if (s1.length()== s2.length())
            r="строки одинаковой дилны";
        else
            r = "строки не равны";
        return r;
    }
}
