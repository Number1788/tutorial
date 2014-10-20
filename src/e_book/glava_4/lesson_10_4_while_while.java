package e_book.glava_4;

/**
 * Created by Alexandr on 20.10.2014.
 */
public class lesson_10_4_while_while {
    public static void main(String[] args){
        int i,j;
        i=0;
        while (i<10){
            j=0;
            while (j<10){
                System.out.print("s");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
