package books.glava_3;

/**
 * Created by Alexandr on 29.09.2014.
 */
public class ternarnyi {
    static int ternary(int i){                      //иницилизация
        return i<10 ? i*100 : i*10;                 //тернарный оператор ? если  true : если false
    }

    static int StandartIfElse(int i){
        if (i<10)
            return i*100;
        else
            return i*10;
    }

    public static void main(String[] args){
        System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println(StandartIfElse(9));
        System.out.println(StandartIfElse(10));
    }
}
