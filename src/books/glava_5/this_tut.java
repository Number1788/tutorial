package books.glava_5;

/**
 * Created by Alexandr on 24.10.2014.
 */
public class this_tut {
    int petalCount=0;
    String s = "initinal value";

    this_tut(int petals){
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount= "  + petalCount);
    }

    this_tut(String ss){
        System.out.println("Constructor w/ String arg only, s = " + ss);
        s = ss;
    }

    this_tut(String s, int petals){
        this(petals);
        this.s=s;
        System.out.println("String & int args");
    }

    this_tut(){
        this("hi",47);
        System.out.println("default constructor");
    }

    void printPetalCount(){
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args){
        this_tut thisTut = new this_tut();
        thisTut.printPetalCount();
    }
}
