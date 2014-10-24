package books.glava_5;

/**
 * Created by Alexandr on 23.10.2014.
 */
class Rock{         //класс(0)
    Rock(int i){    // конструктор с аргументом(1)
        System.out.print("Rock " + i + " ");
    }
}
public class constructor {
    public static void main(String[] args){
        for(int i = 1; i<=10;i++)
            new Rock(i);    //создание нового объекта(0) с конструкторм(1)
    }
}
