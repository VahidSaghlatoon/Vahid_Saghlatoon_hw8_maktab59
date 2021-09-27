package question2;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        exceptionTest(1);

    }

    public static void exceptionTest(int num) {
        try {
            switch (num) {
                case 1:
                    throw new ExceptionA("Exception A");
                case 2:
                    throw new ExceptionB("Exception B");
                case 3:
                    throw new NullPointerException();
                case 4:
                    throw new IOException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("exception test");
        }
    }
}
