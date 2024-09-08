import java.util.List;

public class Customer {
    public List<Order> order;

    public Customer(List<Order> order) {
        this.order = order;
    }

    public List<Order> getOrder(){
        return order;
    }

}
