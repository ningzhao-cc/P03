package eatclub;

import lunch.Food;
import lunch.Noodle;
import lunch.Salad;
import restaurant.Factory;

import java.util.Scanner;

/**
 * Created by Ning on 3/7/18.
 */
public class EatclubFactory extends Factory{

    @Override
    public Food getFood() {
        System.out.println("please select a type of food: salad / noodle");
        Scanner in = new Scanner(System.in);
        String food = in.nextLine();
        switch (food) {
            case "salad" : return getSalad();
            case "noodle" : return getNoodle();
            default: return getFood();
        }
    }

    public Salad getSalad() {
        Salad salad = new EatclubSalad();
        return salad;
    }

    public Noodle getNoodle() {
        Noodle noodle = new EatclubNoodle();
        return noodle;
    }
}
