public class OrderFactory {
    public static Order create(Item item, Quantity quantity)
    throws LimitOverException{
        return new Order(item, quantity, buildLimiter());
    }

    private static QuantityLimit buildLimiter(){
    Item apple = new Item(new ItemName("apple"),new ItemPrice(Currency.YEN,100)
                );

    Item banana = new Item(
            new ItemName("banana"),
            new ItemPrice(Currency.YEN,100));

    Item orange = new Item(
            new ItemName("orange"),
            new ItemPrice(Currency.YEN,120));

    QuantityLimit limit = new QuantityLimit(apple,new Quantity(10));

    limit.setNext(
            new QuantityLimit(banana, new Quantity(20)))
            .setNext(new QuantityLimit(orange, new Quantity(5)));

        return limit;
    }

}
