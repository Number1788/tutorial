package e_book.glava_4;

/**
 * Created by Alexandr on 16.10.2014.
 *
 * calculate cats
 */
public class lesson_2_5 {
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat.count++;

        Cat cat2 = new Cat();
        Cat.count++;

        System.out.println("Cats count is " + Cat.count);
    }
    public static class Cat
    {
        public static int count = 0;
    }
}
