package books.glava_4;

/**
 * Created by Alexandr on 15.10.2014.
 */
public class label_while {
    public static void main(String[] args){
        int i = 0;
        outer:

        while (true){
            System.out.println("Внешний цикл while");

            while (true){
                i++;
                System.out.println("i = " + i);

                if(i == 1){
                    System.out.println("continue");
                    continue ;
                }

                if(i == 3){
                    System.out.println("continue outer");
                    continue outer;
                }

                if (i == 5){
                    System.out.println("Break");
                    break;
                }

                if (i == 7){
                    System.out.println("break_outer");
                    break outer;
                }
            }
        }
    }
}
