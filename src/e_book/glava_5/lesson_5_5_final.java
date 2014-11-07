package e_book.glava_5;

/**
 * Created by Alexandr on 07.11.2014.
 */
public class lesson_5_5_final {
    public static class Cat{
        String name;
        int age;
        int weight;
        int strenght;
        boolean catfight(Cat cat){
            if (((this.strenght*this.weight)/this.age)>((cat.strenght*cat.weight)/cat.age)) return true;
            else return false;
        }
    }

    public static void main(String[] args){
        Cat cat1=new Cat();
        Cat cat2= new Cat();
        Cat cat3= new Cat();
        cat1.name="asa";
        cat1.age=2;
        cat1.weight=7;
        cat1.strenght=10;
        cat2.name="lasa";
        cat2.age=3;
        cat2.weight=7;
        cat2.strenght=10;
        cat3.name="alasa";
        cat3.age=4;
        cat3.weight=15;
        cat3.strenght=12;
        System.out.println(cat1.catfight(cat2));
        System.out.println(cat1.catfight(cat3));
        System.out.println(cat3.catfight(cat2));
    }
}
