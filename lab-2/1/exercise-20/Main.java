class Main {
    public static void main(String[] args) {
        System.out.println();

        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("_______________");
        
        for (int i = 5; i > 0; i--) {
            int spaces = 5 - i;
            for (int s = 5; s > spaces; s--) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
        
        System.out.println("_______________");

        for(int lineNum = 0, numStars = 10; lineNum < 5; lineNum++, numStars -= 2) {
            printSpaces(lineNum);
            printStars(numStars);
            System.out.println();
        }
    }

    public static void printSpaces(int numOfSpaces) {
        for (int i = 0; i < numOfSpaces; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int numOfStars) {
        for(int i = 0; i < numOfStars; i++) {
            System.out.print("*");
        }
    }
}