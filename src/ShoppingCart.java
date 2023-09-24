import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Order> orders;

    public ShoppingCart() {
        this.orders = new ArrayList<Order>();
    }

    public void add(Order order){
        this.orders.add(order);
    }

    public Total getTotal(){
        Total total = null;
        for(Order order:orders){
            total = order.getTotal().add(total);
        }
        return total;
    }
}
