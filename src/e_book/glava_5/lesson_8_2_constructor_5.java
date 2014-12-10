package e_book.glava_5;

/**
 * Created by Alexandr on 11.11.2014.
 */
public class lesson_8_2_constructor_5 {
    String name;
    int weight = 5;
    int age =5;
    String home;
    String color;

    public lesson_8_2_constructor_5(String name){
        this.name= name;
    }

    public lesson_8_2_constructor_5(String name,int weight,int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public lesson_8_2_constructor_5(String name, int age){
        this.name = name;
        this.age = age;
    }

    public lesson_8_2_constructor_5(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    public lesson_8_2_constructor_5(int weight, String color,String home){
        this.weight = weight;
        this.color = color;
        this.home = home;
    }


}
