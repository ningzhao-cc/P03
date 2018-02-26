package client;

import lunch.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ning on 2/26/18.
 */
public class Order {
    // order should be be one order at a time for a person
    List<Food> foods = new ArrayList<>();


    //private Order(){}


    //private static Order instance = new Order();
    //
    //
    //
    //public static Order getInstance() {
    //    return instance;
    //}



    public static Order instance;

    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }

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

}
