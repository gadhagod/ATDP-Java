public class CardTester {
    public static <Card> void main(String[] args) {
        Card a = new Card(2, 'a');
        Card b = new Card(2, 'b');
        Card c = new Card(2, 'c');
        Card d = new Card(3, 'd');
        Card e = new Card(3, 'e');

        Card[] x = {a, b, c, d, e};

        for(Card i : x) {
            System.out.println(i.getRank());
            System.out.println(i.getSuit());
            System.out.println();
        }

    }
}
