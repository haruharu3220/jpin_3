import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Item {
    private  final ItemName name;
    private  final ItemPrice price;
    //private int maxNumber; //この最大値は何？(月間売り上げ最大？棚に陳列できる最大？)→この値だけ浮く→不適なデータ★良くない★

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

//    //★宿題★まとめ売り価格設定
//    public void setBundleSalePrice(Quantity qty,ItemPrice price){
//        bundleSalePrice.put(qty,price);
//    }
//
//    //★宿題★まとめ売り価格判定
//    public ItemPrice getBundleSalePrice(Quantity qty){
//        return bundleSalePrice.get(qty);
//    }


    @Override
    public boolean equals(Object o) {
    if(this == o){
        return true;
    }
    if(o == null || getClass() == o.getClass()){
        return false;
    }
        Item item = (Item)o;
        return Objects.equals(name, item.name) && Objects.equals(price, item.price);

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}