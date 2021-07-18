public class SwapperDemo {
    public static void main(String[] args) {
        Swapper l = new Swapper(1, 2);
        System.out.println("Swapping...");
        l.swap();
        System.out.println("x: " + l.getX());
        System.out.println("y: " + l.getY());
    }
}
