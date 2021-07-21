import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[30];
        for(int i = 0; i < 30; i++) {
            numbers[i] = (int)Math.floor(Math.random() * (10) + 1);
        }
        for(int i : numbers) {
            System.out.println(i);
        }
    }   
}