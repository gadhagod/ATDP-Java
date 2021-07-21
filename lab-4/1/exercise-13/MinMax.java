import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        System.out.print("Array: ");
        int[] arr = {3, 23, 5, 7, 23, 5, 8, 1, 4};
        System.out.println(Arrays.toString(arr));

        int max = 0;
        int min = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max: " + max + "\nMin: " + min);
    }
}
