package client;

/**
 * Created by Ning on 2/26/18.
 */
public class CompanyOrder {
    public Order order;

    public CompanyOrder() {
        order = Order.getInstance();
    }
}
