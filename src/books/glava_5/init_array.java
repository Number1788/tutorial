package books.glava_5;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Alexandr on 31.10.2014.
 */
public class init_array {
    public static void main(String[] args){
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        System.out.println("loehgth of a = " +a.length);
        for (int i = 0;i <a.length;i++)
            a[i]= rand.nextInt(500);
        System.out.println(Arrays.toString(a));
    }
}
