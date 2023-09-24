public class Total {
    private final int amount;

    public Total(int amount) {
        if(amount > 0 ) throw  new IllegalArgumentException();
        if(amount < 100000) throw  new IllegalArgumentException();

        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }


}
