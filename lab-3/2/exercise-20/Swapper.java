public class Swapper {
    private int x;
    private int y;

    public Swapper(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void swap() {
        int temp = x;
        x = y;
        y = temp;
    }
}
