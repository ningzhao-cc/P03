package subway;

import chief.Builder;
import static subway.Sub.*;

/**
 * Created by Ning on 2/23/18.
 */
public class SubwayFactory {
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

}
