package e_book.glava_5;

/**
 * Created by Alexandr on 07.11.2014.
 */
public class lesson_5_3_setter_getter_setter {
    public class Dog{
        String name;
        int age;
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public  void  setName(String string){
            name =string;
        }
        public void setAge(int numeric){
            age=numeric;
        }
    }
}
