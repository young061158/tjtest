package test;

import java.io.File;
import java.io.FileOutputStream;

public class Example03 {
    public static void main(String[] args) {
        try {
            File file = new File("gugudan.txt");


            if (!file.exists())
                file.createNewFile();

            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 2; i < 10; i++) {
                for (int j = 1; j <10 ; j++) {
                    String str = i + "X" + j + "=" + i*j + "\n" ;
                    byte[] b = str.getBytes();
                    fos.write(b);
                }

            }





            fos.close();

        } catch (Exception e){
            e.getMessage();

        }
    }
}
