package receipt;

import lunch.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ning on 3/15/18.
 */
public abstract class Receipt implements Cloneable {
    private List<Food> foodStringList;

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


    public List<Food> getFoodStringList() {
        return foodStringList;
    }

    public void print() {
        if (foodStringList == null || foodStringList.size() == 0) {
            System.out.println("no orders");
        }
        else {
            for (Food food : foodStringList) {
                System.out.println("in receipts : " + food.toString());
            }
        }
    }
}
