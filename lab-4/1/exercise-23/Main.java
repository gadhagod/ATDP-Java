import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for(int i = 0; i < 10; i++) {
            numbers[i] = (int) Math.floor(Math.random() * (10) + 1);
        }
        
        System.out.println("Before: " + Arrays.toString(numbers));

        for(int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }

        System.out.println("After: " + Arrays.toString(numbers));
    }
}