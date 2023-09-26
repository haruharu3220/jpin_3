public class LimitQuantity {
    private int quantity;

    public LimitQuantity(int quantity) {

        if(quantity <= 0 ) throw new IllegalArgumentException();

        if(quantity > 100) throw new IllegalArgumentException();

        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
