package e_book.glava_5;

/**
 * Created by Alexandr on 04.03.2015.
 */
public class lesson_8_5_constructor_4 {
    int left,top,width,height;

    lesson_8_5_constructor_4(int left,int top, int width,int height){
        this.left = left;
        this.width = width;
        this.height = height;
        this.top = top;
    }
    lesson_8_5_constructor_4(int top,int left){
        this.left = left;
        this.width = 0;
        this.height = 0;
        this.top = top;
    }

    lesson_8_5_constructor_4(int top,int left, int height){
        this.left = left;
        this.width = this.height = height;
        this.top = top;
    }
}
