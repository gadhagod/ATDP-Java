import java.util.*;

public class Main {
    private static String hangMan = "";
    private static String templateHangMan = "  +---+\n     |\n     |\n     |\n     ==";
    private static String guessed = "";
    private static String status = hangMan + templateHangMan + "\n" + guessed;
    private static ArrayList<String> guessedChars = new ArrayList<String>();
    private static int wrongGuesses = 0;

    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        //final
        String[] words = {"hello", "brush", "maids", "final", "fleet", "foggy", "flies", "frame", "forms", "grown", "guard", "holly", "mania", "onion", "order", "ocean", "nerds", "pails", "paper", "parks"};
        String word = words[(int) Math.floor(Math.random() * (20) + 1)];

        for(int i = 0; i < word.length(); i++) {
            guessed += "_";
        }
        
        while(true) {
            System.out.print("Enter a letter: ");
            String inpLet = input.nextLine();
            int index = word.indexOf(inpLet);
            if(index == -1) {
                addBodyPart();
                wrongGuesses++;
            } else {
                guessed = guessed.substring(0, index) + inpLet + guessed.substring(index + 1);
            }
            printUpdateHangman();
            guessedChars.add(inpLet);
            System.out.println("Guessed letters: " + guessedChars);

            if(wrongGuesses == word.length() || guessed.equals(word)) {
                if(guessed.equals(word)) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose! The correct word was " + word);
                }
                break;
            }
        }
    }   

    private static void addBodyPart() {
        if(guessedChars.size() == 0) {
            hangMan += " 0";
        } else if(guessedChars.size() <= 2) {
            hangMan += "\n |";
        } else if(guessedChars.size() == 3) {
            hangMan += "\n/";
        } else {
            hangMan += "\n\\";
        }
    }

    private static void printUpdateHangman() {
        status = hangMan + templateHangMan + "\n" + guessed;
        System.out.println(status);
    }

}