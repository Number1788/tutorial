package books.glava_4;

/**
 * Created by Alexandr on 13.10.2014.
 */
public class if_else {
    static int result = 0;
    static void test (int testval, int target){
        if(testval > target)
            result=+1;
        else  if(testval < target)
            result=-1;
        else
            result = 0;
    }

    public static  void main(String[] args){
        test(10,5);
        System.out.println(result);
        test(5,10);
        System.out.println(result);
        test(5,5);
        System.out.println(result);
    }
}
