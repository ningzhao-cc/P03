package eatclub;

import lunch.Salad;
import utils.CCCUtil;

/**
 * Created by Ning on 3/7/18.
 */
public class EatclubSalad extends Salad{
    final String prefix = "Eatclub : Salad : ";

    private String saladId;
    public void print() {
        System.out.println(saladId);
    }

    @Override
    public String toString() {
        return saladId;
    }

    public EatclubSalad() {
        saladId = prefix + CCCUtil.createInt();
    }
}
