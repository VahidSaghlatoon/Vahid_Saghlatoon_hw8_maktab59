package question1;

public class Car implements Turner{
    @Override
    public void turn() {
        double turn =  Math.random();
        if (turn < 0.5 )
            System.out.println("car is turn off");
        else
            System.out.println("car is turn on");

    }
}
