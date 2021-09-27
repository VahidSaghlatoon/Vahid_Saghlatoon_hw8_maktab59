package question3;

public class Runner {
    public static void main(String[] args) {

        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("caught in  main");
            e.printStackTrace();
        }

    }

    public static void someMethod() {
        try {
            someMethod2();
        } catch (ArithmeticException ex) {
            System.out.println("throw from someMethod");
            throw ex;
        }
    }

    public static void someMethod2() {
        System.out.println("exception in someMethod 2");
        throw new ArithmeticException("throw from someMethod2");

    }
}
