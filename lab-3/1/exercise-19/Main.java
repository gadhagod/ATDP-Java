public class Main {
    public static int max(int x, int y, int z) {
        if(x > y && x > z) {
            return x;
        }
        if (y > x && y > z) {
            return y;
        }
        return z;
    }
}
