package books.glava_4;
import java.util.*;

/**
 * Created by Alexandr on 15.10.2014.
 */
public class switch_random {

    public static void main(String[] args){

        Random random = new Random(47);

        for (int i = 0; i < 100; i++){
            int c =random.nextInt(26) + 'a';
            System.out.println((char)c +", " + c + ": ");

            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': System.out.println("vowel");
                          break;
                case 'y':
                case 'w': System.out.println("Sometimes a vowel");
                          break;
                default: System.out.println("constant");
            }
        }
    }
}
