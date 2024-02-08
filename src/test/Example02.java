package test;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Example02 {
    public static void main(String[] args)  {

        File file = new File("example02.txt");


        try {

            if (!file.exists())
                file.createNewFile();

            FileWriter fw = new FileWriter(file);
            Scanner sc = new Scanner(System.in);


            boolean quit = false;

            while (!quit) {
                System.out.print("아이디 : ");
                String userID = sc.next();
                fw.write("아이디 : " + userID + " ");

                System.out.print("이름 : ");
                String userName = sc.next();
                fw.write("이름 : " + userName + "\n");

                System.out.println("계속 진행 하시겠습니까 ? Y | N");
                sc = new Scanner(System.in);
                String str = sc.nextLine();

                if (str.toUpperCase().equals("N"))
                    quit = true;
            }
            fw.close();
            System.out.println("파일 쓰기 성공");




        } catch (Exception e) {
            e.getMessage();
        }
    }
}
