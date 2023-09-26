import java.util.Map;

public class Item {
    private  ItemName name;
    private  ItemPrice price;
    private Quantity limitQuantity;

    private Map<Quantity,ItemPrice> bundleSalePrice;

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
    public boolean isPurchasePossible(Quantity qty){
        if(qty.getAmount() <= limitQuantity.getAmount()) return true;
        return false;
    }

    //★宿題★まとめ売り価格判定
    public ItemPrice getBundleSalePrice(Quantity qty){
        return bundleSalePrice.get(qty);
    }

}
