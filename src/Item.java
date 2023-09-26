public class Item {
    private  ItemName name;
    private  ItemPrice price;
    private Quantity limitQuantity;

    public Item(ItemName name, ItemPrice price, Quantity limitQuantity) {
        super();
        if(name == null || price == null) throw new IllegalArgumentException();

        if(limitQuantity == null) throw new IllegalArgumentException();

        this.name = name;
        this.price = price;
        this.limitQuantity = limitQuantity;
    }

    public ItemName getName(){
        return name;
    }

    public ItemPrice getPrice() {
        return price;
    }

    public Quantity getLimitQuantity() {
        return limitQuantity;
    }
    //★宿題★購入上限値判定
    public boolean isPurchasePossible(int qty){
        if(qty <= limitQuantity.getAmount()) return true;
        return false;
    }

}
