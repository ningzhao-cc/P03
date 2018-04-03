package client;

import lunch.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ning on 3/19/18.
 */

/**
 * testing the Prototype pattern vs Singleton pattern
 */
public class CompanyOrderPrototype extends Order implements Cloneable{
    private List<Food> foodList = new ArrayList<>();

    private CompanyOrderPrototype(){}

    // //
    private static CompanyOrderPrototype instance = new CompanyOrderPrototype();

    public static CompanyOrderPrototype getInstance() {
        return instance;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
