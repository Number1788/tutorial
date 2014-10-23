package books.glava_5;

/**
 * Created by Alexandr on 23.10.2014.
 */
class Rock{
    Rock(int i){
        System.out.print("Rock " + i + " ");
    }
}
public class constructor {
    public static void main(String[] args){
        for(int i = 1; i<=10;i++)
            new Rock(i);
    }
}
