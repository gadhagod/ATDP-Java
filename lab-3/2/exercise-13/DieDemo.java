public class DieDemo {
    public static void main(String[] args) {
        Die die1 = new Die(1);
        Die die2 = new Die(1);
        die1.roll();
        die2.roll();
        System.out.println(die1.getSideUp() + die2.getSideUp());
    }
}