public class Item {
    private  ItemName name;
    private  ItemPrice price;

    public Item(ItemName name, ItemPrice pricec) {
        super();
        if(name == null || price == null) throw  new IllegalArgumentException();

        this.name = name;
        this.price = pricec;
    }

    public ItemName getName(){
        return name;
    }

    public ItemPrice getPrice() {
        return price;
    }
}
