package e_book.glava2;

/**
 * Created by Alexandr on 07.10.2014.
 */
public class lesson_8_5_tripplestring {
    public static void main(String[] args)
    {
       String in="Help!";
      tripple(in);
    }
    public static void tripple(String s){
        for (int i=0;i<3;i++)
            System.out.println(s);
    }
}
