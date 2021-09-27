package question1;

public class Lamp implements Turner{
    @Override
    public void turn() {
        double turn =  Math.random();
        if (turn < 0.5 )
            System.out.println("lamp is turn off");
        else
            System.out.println("lamp is turn on");
    }
}
