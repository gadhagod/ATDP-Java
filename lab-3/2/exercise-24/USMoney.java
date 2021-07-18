public class USMoney {
    int dollars;
    int cents;

    public USMoney(int dollars, int cents) {

        if (cents > 99) {
            dollars += cents / 99;
            cents = cents % 99;
        }

        this.dollars = dollars;
        this.cents = cents;
    }

    public USMoney plus(USMoney x) {
        return new USMoney(x.dollars + dollars, x.cents + cents - 1);
    }

    public String toString() {
        return "$" + dollars + "." + cents;
    }
}
