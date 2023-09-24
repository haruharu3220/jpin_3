public class Quantity {
    private final int amount;

    public Quantity(int amount) {
        super();
        if(amount <= 0 || amount >= 100) throw  new IllegalArgumentException();
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
