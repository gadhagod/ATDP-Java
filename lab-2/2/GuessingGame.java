/*
Did challenge #1 and #2
*/

import java.util.Scanner;

class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            int number = (int) (Math.random() * 101);
            int guess = -1;
            int points = 10;

            while (true) {
                System.out.print("Guess a #: ");
                guess = input.nextInt();
                if (guess < number) {
                    System.out.println("Too less");
                } else if (guess > number){
                    System.out.println("Too high");
                } else {
                    break;
                }
                points--;
            }
            System.out.print("You guessed the number with " + points + " points!\nDo you want to play again (y/n)? ");
            input.nextLine();
            String playAgain = input.nextLine();
            if (playAgain.toLowerCase().equals("n")) {
                break;
            }
        }
    }
}