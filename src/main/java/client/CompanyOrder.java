package client;

import lunch.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ning on 2/26/18.
 */
public class CompanyOrder extends Order{
    private List<Food> foodList = new ArrayList<>();

    private static CompanyOrder instance = new CompanyOrder();

    private CompanyOrder(){}

    public static CompanyOrder getInstance() {
        return instance;
    }
}
