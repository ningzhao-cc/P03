package client;

/**
 * Created by Ning on 2/26/18.
 */
public class Customer {

    public Order order;

    public Customer() {

        // Order construction is public to use, when a customer to create order
        order = new Order();
    }

}
