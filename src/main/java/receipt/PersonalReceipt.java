package receipt;

import lunch.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ning on 3/15/18.
 */
public class PersonalReceipt extends Receipt {
    private List<Food> foodStringList;

    public Object clone() {
        Object clone = null;
        clone = super.clone();
        return clone;
    }

    //// shallow copy
    //public PersonalReceipt(List<Food> foods) {
    //    foodStringList = foods;
    //}

    // deep copy
    public PersonalReceipt(List<Food> foods) {
        foodStringList = new ArrayList<>();
        for (Food f : foods) {
            foodStringList.add(f);
        }
    }

    public PersonalReceipt(Object o) {
        foodStringList = ((PersonalReceipt)o).getFoodStringList();
    }

    public List<Food> getFoodStringList() {
        return foodStringList;
    }

    public void print() {
        if (foodStringList == null || foodStringList.size() == 0) {
            System.out.println("no orders");
        }
        else {
            for (Food f : foodStringList) {
                System.out.println("in receipts : " + f.toString());
            }
        }
    }
}
