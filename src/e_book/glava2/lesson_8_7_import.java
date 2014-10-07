package e_book.glava2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Alexandr on 07.10.2014.
 */
public class lesson_8_7_import {
    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream("c:\\data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("c:\\result.txt");

        while (fileInputStream.available()>0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

}
