package e_book.glava_4;

import java.util.Scanner;

/**
 * Created by Alexandr on 20.10.2014.
 */
public class lesson_13_2_for_input_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++)
                System.out.print(8);
            System.out.println();
        }
    }
}
