public class Main {
    public static void main(String[] args) {
        int i = 2;
        while(true) {
            System.out.print("Factors of " + i + ": ");
            int count = 0;
            for(int j = 2; j < i; j++) {
                if((i%j) == 0) { 
                    System.out.print(j + " ");
                    count++;
                }
            }
            System.out.println();
            if (count == 9)  {
                break;
            }
            i++;
        }
    }
}