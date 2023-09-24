public class ItemPrice {
    //金額
    private final int amount;
    private final Currency currency;

    public ItemPrice(Currency currency , int amount) {
        super();

        if(currency == null){
            throw  new IllegalArgumentException();
        }

        if( amount < 0 ){
            throw new IllegalArgumentException();
        }
        if( amount > 100000 ){
            throw new IllegalArgumentException();
        }

        this.currency = currency;
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }

}
