import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] A = new int[10][];

        for(int i = 0; i < 10; i++) {
            A[i] = new int[i+1];
            for(int j = 0; j < i; j++) {
                A[i][j] = i + j;
            }
        }

        for (int i = 0; i < 10; i++) { // for each row
            printSpaces(10 - i);
            for (int j = 0; j < i; j++) { //
                System.out.print(A[i][j] + " ");
                if (A[i][j] < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printSpaces(int n) {
        for(int i = 0; i < n; i++){
            System.out.print(" ");
        }
    }
}
