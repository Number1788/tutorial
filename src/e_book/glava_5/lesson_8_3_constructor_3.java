package e_book.glava_5;

/**
 * Created by Alexandr on 12.11.2014.
 */
public class lesson_8_3_constructor_3 {
    String name;
    int height;
    String color;

    lesson_8_3_constructor_3(String name){
        this.name=name;
    }

    lesson_8_3_constructor_3(String name, int height){
        this.name = name;
        this.height=height;
    }

    lesson_8_3_constructor_3(String name, int height, String color){
        this.name = name;
        this.height=height;
        this.color = color;
    }
}
