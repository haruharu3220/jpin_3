import java.time.LocalDate;
public class QuantityLimit {
    private Order limit;
    private QuantityLimit next;

    private LocalDate start;
    private LocalDate end;

    public QuantityLimit(Item item, Quantity quantity) {
        this.limit = new Order(item,quantity);
    }

    public QuantityLimit setNext(QuantityLimit next){
        this.next = next;
        return next;
    }

    public void check(Order target) throws LimitOverException{
        //limitとtargetが別のアイテムの可能性もある
        //対応が必要
        if( limit.isLessThan(target) ){
            throw new LimitOverException();
        }
        if(this.next != null){
            this.next.check(target);
        }

    }

}





