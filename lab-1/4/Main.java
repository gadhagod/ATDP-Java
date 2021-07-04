import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dollar amount: ");
        double amount = input.nextDouble();

        double amountNoQuarters = amount % 0.25;
        double amountOfQuarters = amount - amountNoQuarters;
        int numOfQuarters = (int) Math.round(amountOfQuarters / 0.25);

        double amountNoDimes = amountNoQuarters % 0.10;
        double amountOfDimes = amountNoQuarters - amountNoDimes;
        int numOfDimes = (int) Math.round(amountOfDimes / 0.10);

        double amountNoNickels = amountNoDimes % 0.05;
        double amountOfNickels = amountNoDimes - amountNoNickels;
        int numOfNickels = (int) Math.round(amountOfNickels / 0.05);

        double amountNoPennies = amountNoNickels % 0.01; // should be 0
        double amountOfPennies = amountNoDimes - amountNoPennies;
        int numOfPennies = (int) Math.round(amountOfPennies / 0.01);

        System.out.println("Quarters: " + numOfQuarters);
        System.out.println("Dimes: " + numOfDimes);
        System.out.println("Nickels: " + numOfNickels);
        System.out.println("Pennies: " + numOfPennies);
    }
}
