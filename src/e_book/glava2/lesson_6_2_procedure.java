package e_book.glava2;

/**
 * Created by Alexandr on 23.09.2014.
 */
public class lesson_6_2_procedure {
    public static  void main(String[] args)
    {
        Student olga = new Student();                   //создание нового объекта типа Студент
        olga.name="Olga";                               //краткое присвоение
        olga.age=21;                                    //краткое присвоение

        Student vera = new Student();                   //создание нового объекта типа Студент
        vera.name="Veronika";                           //краткое присвоение
        vera.age=22;                                    //краткое присвоение

        System.out.println("Olga is " + olga.age);
        System.out.println("Vera is " + vera.age);

        ageSwap(olga,vera);                             //вызов процедуры

        System.out.println("Olga is " + olga.age);
        System.out.println("Vera is " + vera.age);

    }
    private static void ageSwap(Student a, Student b){  //иницилизация проедуры
        int c = a.age;                                  //краткое присвоение
        a.age=b.age;                                    //краткое присвоение
        b.age=c;                                        //краткое присвоение
    }


    static class Student{                               //иницилизация класса
     String name;
     int age;
    }

}
