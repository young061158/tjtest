package test;

import java.io.File;
import java.io.FileReader;

public class Example04 {
    public static void main(String[] args) {
        try {
            File file = new File("example03.txt");
            if (!file.exists())
                file.createNewFile();

            FileReader fis = new FileReader(file);
            int i = 0;

            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();
            System.out.println("\n파일 읽기 성공");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
