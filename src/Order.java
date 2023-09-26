public class Order {
    private final Item item;
    private final Quantity quantity;

    public Order(Item item, Quantity quantity) {
        super();
        if(item == null ) throw  new IllegalArgumentException();
        if(quantity == null || quantity.getAmount() > item.getLimitQuantity().getQuantity())    throw   new IllegalArgumentException();

        //★宿題★購入上限値を超えたら例外を吐く
        if(!item.isPurchasePossible(quantity.getAmount())) throw new IllegalArgumentException();

        this.item = item;
        this.quantity = quantity;

    }

    public Total getTotal(){
        //悪い例　理由＝カプセル化違反
        //int result = this.item.getPrice().getAmount() * this.quantity.getAmount();
        //return new Total(result);

        //良い例　理由 ItemPriceクラスで小計の計算をしている＝責務の分離ができている
        ItemPrice price = this.item.getPrice().multi(quantity);
        return new Total(price.getAmount());
    }


}
