package client;

import lunch.Food;
import receipt.PersonalReceipt;
import receipt.Receipt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ning on 2/26/18.
 */
public class Order {
    // order should be be one order at a time for a person
    List<Food> foods = new ArrayList<>();

    public void addOrder(Food food) {
        foods.add(food);
    }

    public void print() {
        if (foods.size() == 0) {
            System.out.println("you have not ordered anything yet.");
        }

        else {
            for (Food f : foods) {
                f.print();
            }
        }
    }

    public Receipt getReceipt() {
        Receipt receipt = new PersonalReceipt(foods);
        return new PersonalReceipt(receipt.clone());
        //return receipt;

    }

}
