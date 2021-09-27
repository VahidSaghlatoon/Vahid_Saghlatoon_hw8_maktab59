package question1;

public class DemoTurners {
    public static void main(String[] args) {
        Turner leaf = new Leaf();
        leaf.turn();
        Turner page = new Page();
        page.turn();
        Turner pancake = new Pancake();
        pancake.turn();
        Turner lamp = new Lamp();
        lamp.turn();
    }
}
