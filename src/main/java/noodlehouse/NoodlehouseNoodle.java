package noodlehouse;

import lunch.Noodle;
import utils.CCCUtil;

/**
 * Created by Ning on 3/7/18.
 */
public class NoodlehouseNoodle extends Noodle{
    final String prefix = "Noodlehouse : Noodle : ";

    private String noodleId;
    public void print() {
        System.out.println(noodleId);
    }

    public String toString() {
        return noodleId;
    }

    public NoodlehouseNoodle() {
        noodleId = prefix + CCCUtil.createInt();
    }
}
