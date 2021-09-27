package question1;

public class Leaf implements Turner {
    private String color ;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void turn() {
        System.out.println("new color is : " + getColor());

    }
}
