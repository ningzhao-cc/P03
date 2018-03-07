package eatclub;

import lunch.Noodle;
import utils.CCCUtil;

/**
 * Created by Ning on 3/7/18.
 */
public class EatclubNoodle extends Noodle{
    final String prefix = "Eatclub : Noodle : ";

    private String noodleId;
    public void print() {
        System.out.println(noodleId);
    }

    public String toString() {
        return noodleId;
    }

    public EatclubNoodle() {
        noodleId = prefix + CCCUtil.createInt();
    }
}
