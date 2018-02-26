package client;

/**
 * Created by Ning on 2/26/18.
 */
public class CompanyOrder {
    public Order order;

    public CompanyOrder() {

        // a new CompanyOrder() is not to create a new Order, instead, get the instance of it.
        order = Order.getInstance();
    }
}
