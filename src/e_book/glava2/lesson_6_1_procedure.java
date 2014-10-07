package e_book.glava2;

/**
 * Created by Alexandr on 23.09.2014.
 */
public class lesson_6_1_procedure {
    public static  void main(String[] args){
        int m=5;
        int n=6;

        System.out.println("M=" +m+" N="+n);
        swap(m,n);
        System.out.println("M=" +m+" N="+n);

    }

    private static void swap(int a,int b){

        int c=a;
        a=b;
        b=c;
    }
}
