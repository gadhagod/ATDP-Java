import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gallons: ");
        int gallons = input.nextInt();

        double liters = gallons * 3.7854118;
        System.out.println(liters);
    }
}
