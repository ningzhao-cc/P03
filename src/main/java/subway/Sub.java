package subway;

import lunch.Food;
import utils.CCCUtil;

/**
 * Created by Ning on 2/23/18.
 */



public class Sub extends Food {
    final String prefix = "Subway : Sub : ";

    public enum Size {
        SMALL,
        MEDIUM,
        LARGE
    }

    public enum Spicy {
        NONE,
        MEDIUM,
        HOT,
        SUPER,
        DEAD
    }

    private String subId;
    private Size size;
    private boolean oven;
    private Spicy spicy;

    protected Sub() {
        subId = prefix + CCCUtil.createInt();
        size = Size.MEDIUM;
        oven = false;
        spicy = Spicy.NONE;
    }

    protected void setSpicy(Spicy spicy) {
        this.spicy = spicy;
    }

    protected void setSize(Size size) {
        this.size = size;
    }

    protected void setOven(boolean oven) {
        this.oven = oven;
    }

    public String toString() {
        return subId;
    }

    public void print() {
        System.out.println("this is a size: " + size + ", ovened ? " + oven + ", spicy: " + spicy + " sub!");
    }
}
