package books.glava_4;

/**
 * Created by Alexandr on 14.10.2014.
 */
public class for_1 {
    public static void main(String[] args){
        for (char c = 0; c < 128;c++)
            if (Character.isLowerCase(c))
                System.out.println("value: " + (int)c + " character: " + c);
    }
}
