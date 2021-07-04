import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Weight on Earth: ");
        double weightOnEarth = input.nextDouble();
        double weightOnMars = 0.37 * weightOnEarth;

        System.out.println(weightOnMars);
    }
}