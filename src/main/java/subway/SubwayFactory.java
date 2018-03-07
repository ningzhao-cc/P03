package subway;

import chief.Builder;
import client.Order;
import lunch.Food;
import restaurant.Factory;

import java.util.Scanner;

import static subway.Sub.*;

/**
 * Created by Ning on 2/23/18.
 */
public class SubwayFactory extends Factory{
    SubBuilder subBuilder = new SubBuilder();

    public class SubBuilder extends Builder {
        Sub sub = new Sub();

        @Override
        public SubBuilder setSpicy(Spicy spicy) {
            sub.setSpicy(spicy);
            return subBuilder;

        }

        @Override
        public SubBuilder setSize(Size size) {
            sub.setSize(size);
            return subBuilder;
        }

        @Override
        public SubBuilder setOven(boolean oven) {
            sub.setOven(oven);
            return subBuilder;

        }

        public Sub getFood() {
            return sub;
        }
    }

    public SubBuilder getSubBuilder() {
        return subBuilder;
    }

    public Food getFood() {
        Scanner in = new Scanner(System.in);

        System.out.println("size? SMALL,\n" +
                "        MEDIUM,\n" +
                "        LARGE");

        String size_string = in.nextLine();

        switch (size_string) {
            case "SMALL" : subBuilder.setSize(Size.SMALL);
            break;
            case "MEDIUM" : subBuilder.setSize(Size.MEDIUM);
            break;
            case "LARGE" : subBuilder.setSize(Size.LARGE);
            break;
            default: ;
        }

        System.out.println("spicy? NONE,\n" +
                "        MEDIUM,\n" +
                "        HOT,\n" +
                "        SUPER,\n" +
                "        DEAD");

        String spicy_string = in.nextLine();

        switch (spicy_string) {
            case "NONE" : subBuilder.setSpicy(Spicy.NONE);
            break;
            case "MEDIUM" : subBuilder.setSpicy(Spicy.MEDIUM);
            break;
            case "HOT" : subBuilder.setSpicy(Spicy.HOT);
            break;
            case "SUPER" : subBuilder.setSpicy(Spicy.SUPER);
            break;
            case "DEAD" : subBuilder.setSpicy(Spicy.DEAD);
            break;
            default: ;
        }

        System.out.println("Oven ? yes / no");

        String oven_string = in.nextLine();

        switch (oven_string) {
            case "yes" : subBuilder.setOven(true);
            break;
            case "no" : subBuilder.setOven(false);
            break;
            default: ;
        }

        return subBuilder.getFood();
    }
}
