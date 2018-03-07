package noodlehouse;

import eatclub.EatclubNoodle;
import eatclub.EatclubSalad;
import lunch.Food;
import lunch.Noodle;
import lunch.Salad;
import restaurant.Factory;

import java.util.Scanner;

/**
 * Created by Ning on 3/7/18.
 */
public class NoodlehouseFactory extends Factory{
    @Override
    public Food getFood() {
        System.out.println("please select a type of food: noodle");
        Scanner in = new Scanner(System.in);
        String food = in.next();
        in.close();
        switch (food) {
            case "noodle" : return getNoodle();
            default: return getFood();
        }
    }

    public Noodle getNoodle() {
        Noodle noodle = new NoodlehouseNoodle();
        return noodle;
    }
}
