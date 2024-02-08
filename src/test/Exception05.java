package test;

import java.io.File;

class InvalidException extends Exception {
    public InvalidException(String s ){
        super(s);
    }
}
public class Exception05 {
    void check(int weight) throws InvalidException {
        if (weight < 100) {
            throw new InvalidException("권영학");

        }
    }

    public static void main(String[] args) {

        Exception05 obj = new Exception05();
        try {
            obj.check(60);
        }
        catch (InvalidException ex){
            System.out.println("예외 처리입니다.");
            System.out.println(ex.getMessage());
        }
    }
}
