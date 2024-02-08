package test;

import java.util.Hashtable;
import java.util.Vector;

public class Example08 {
    public static void main(String[] args) {
        // 문자열 배열 선언
        String[] words = {"apple", "banana", "apple", "orange", "banana", "banana"};

        // 해시테이블 생성
        Hashtable<String, Integer> wordCount = new Hashtable<String, Integer>();

        // 각 문자열에 대해 카운트
        for(String word : words) {
            Integer count = wordCount.get(word);
            if(count == null) {
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, count + 1);
            }
        }

        // 결과 출력
        System.out.println(wordCount);
    }
}
