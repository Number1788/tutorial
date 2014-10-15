package books.glava_4;

/**
 * Created by Alexandr on 15.10.2014.
 */
public class break_continue {
    public static void main(String[] args){
        for(int i = 0; i < 100; i++){
            if (i == 74) break;
            if (i % 9 !=0) continue;
            System.out.print(i + " ");
        }

        System.out.println();
        int a[] = new int[100];
        for(int i = 0; i < 100; i++) a[i]=i;

        for (int i : a){
            if (i == 74) break;
            if (i % 9 !=0) continue;
            System.out.print(i + " ");
        }

        System.out.println();
        int i = 0;

        while (true){
            i++;
            int j = i*27;
            if(j == 1269) break;
            if (i % 10 != 0) continue;
            System.out.print(i + " ");
        }
    }
}
