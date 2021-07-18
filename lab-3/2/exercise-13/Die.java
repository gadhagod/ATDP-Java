public class Die {
    private int sideUp;

    public Die(int sideUp) {
        this.sideUp = sideUp;
    }

    public int getSideUp() {
        return sideUp;
    }

    public void roll() {
        sideUp = (int)(Math.random() * 6) + 1;
    }
}