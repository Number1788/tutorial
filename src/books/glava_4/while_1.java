package books.glava_4;

/**
 * Created by Alexandr on 13.10.2014.
 */
public class while_1 {
    static boolean condition(){
        boolean result = Math.random() < 0.99;
        System.out.println(result + ", ");
        return result;
    }

    public static void main(String[] args){
        while(condition())
            System.out.println("Inside ");
        System.out.println("Exited");
    }
}
