package e_book.glava_5;

/**
 * Created by Alexandr on 11.11.2014.
 */
public class lesson_8_1_constructor_3 {
    String name;
    int age;
    boolean sex;

    public lesson_8_1_constructor_3(String name){
        this.name = name;
    }

    public lesson_8_1_constructor_3(String name, int age){
        this.name = name;
        this.age = age;
    }

    public lesson_8_1_constructor_3(String name, int age, boolean sex){
        this.name = name;
        this.age = age;
        this.sex =sex;
    }
}
