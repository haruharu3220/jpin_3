public class Order {
    private final Item item;
    private final Quantity quantity;

    public Order(Item item, Quantity quantity) {
        super();
        if(item == null ) throw  new IllegalArgumentException();
        if(quantity == null || quantity.getAmount() > item.getLimitQuantity().getAmount())    throw   new IllegalArgumentException();

        //★宿題★購入上限値を超えたら例外を吐く
        if(!item.isPurchasePossible(quantity)) throw new IllegalArgumentException();

        this.item = item;
        this.quantity = quantity;

    }

    public Total getTotal(){
        //悪い例　理由＝カプセル化違反
        //int result = this.item.getPrice().getAmount() * this.quantity.getAmount();
        //return new Total(result);

        //良い例　理由 ItemPriceクラスで小計の計算をしている＝責務の分離ができている

        //★宿題★　まとめ売り価格が設定されていなければ、値段×個数
        if(item.getBundleSalePrice(quantity)==null) {
            ItemPrice price = this.item.getPrice().multi(quantity);
            return new Total(price.getAmount());
        }else {
            ItemPrice price = item.getBundleSalePrice(quantity);
            return new Total(price.getAmount());
        }
    }


}
