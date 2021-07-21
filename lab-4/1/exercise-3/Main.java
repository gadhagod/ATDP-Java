public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 3, 7, 3, 316, 9, 1, 5};
        double sum = 0;
        for(int i : numbers) {
            sum += i;
        }
        double res = sum / numbers.length;
        System.out.println(res);
    }
}
