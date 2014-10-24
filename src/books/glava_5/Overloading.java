package books.glava_5;

/**
 * Created by Alexandr on 24.10.2014.
 */
class Tree{                     //класс(0)
    int height;

    Tree(){                     //конструктор без параметров(по умолчанию)(1)
        System.out.println("Planting a seeding");
        height = 0;
    }

    Tree(int initialHeight){    //конструктор с параметрами(2)
        height = initialHeight;
        System.out.println("Creating new tree that is " + height +" feet tall");
    }

    void info(){                //метод(3)
        System.out.println("Tree is " + height + " feet tall");
    }

    void info(String s){        //перегруженый метод(4)
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}

class OveloadingOrder{              //класс (5)
    void f(String s,int i){  //метод(6)
        System.out.println("String: " + s + ", int: " + i);
    }

    void f(int i,String s){  //пергруженный метод путем порядка аргументов(7)
        System.out.println("int: " + i+ ", String: " + s);
    }
}

public class Overloading {
    public static void main(String[] args){
        for (int i = 0; i<5;i++){
            Tree t = new Tree(i);           //создание нового объекта (0) с конструктором (2)
            t.info();                       //вызов метода(3)
            t.info("overload method");      //вызов метода(4)
        }
        new Tree();                         //создание нового объекта(0) с конструктором(1)

        OveloadingOrder oveloadingOrder = new OveloadingOrder();    //созадание нового объекта (5)
        oveloadingOrder.f("String first",11);                       //вызов метод(6)
        oveloadingOrder.f(99,"int first");                          //вызов метода(7)
    }
}
