package test;

import java.io.File;
import java.io.IOException;


public class Exception01 {
    public static void main(String[] args) throws IOException {
        File fInfo = new File("D:/sample/example01.js");

        if (fInfo.exists()) {
            System.out.println("파일의 이름 : " + fInfo.getName());
            System.out.println("파일의 경로 :" + fInfo.getAbsolutePath());
            System.out.println("파일 쓰기 가능 ? " + fInfo.canWrite());
            System.out.println("파일 읽기 가능 ? " + fInfo.canRead());
            System.out.println("파일의 크기: "+fInfo.length());
        } else  {
            System.out.println("존재하는 파일이 아닙니다.");
            }

        }
    }
