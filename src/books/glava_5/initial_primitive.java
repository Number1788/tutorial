package books.glava_5;

/**
 * Created by Alexandr on 28.10.2014.
 */
public class initial_primitive {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    initial_primitive reference;

    void printinitial_primitive(){
        System.out.println("Data type       Iniatial value");
        System.out.println("boolean         " + t);
        System.out.println("char            [" +c+"]");
        System.out.println("byte            " + b);
        System.out.println("short           " + s);
        System.out.println("int             " + i);
        System.out.println("long            " + l);
        System.out.println("float           " + f);
        System.out.println("double          " + d);
        System.out.println("refernce        " + reference);
    }

    public static  void main(String[] args){
        initial_primitive ip = new initial_primitive();
        ip.printinitial_primitive();
    }
}
