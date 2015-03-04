package e_book.glava_5;

/**
 * Created by Alexandr on 03.03.2015.
 */
public class lesson_8_4_constructor_3 {
    int centerX,centerY, radius, width;
    String color;

    lesson_8_4_constructor_3(int centerX,int centerY,int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    lesson_8_4_constructor_3(int centerX,int centerY,int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    lesson_8_4_constructor_3(int centerX,int centerY,int radius, int width,String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }


}
