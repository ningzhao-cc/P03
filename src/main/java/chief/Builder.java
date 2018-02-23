package chief;

import ch.qos.logback.core.joran.spi.DefaultClass;
import lunch.Food;
import static subway.Sub.*;
import subway.SubwayFactory;

/**
 * Created by Ning on 2/23/18.
 */
public abstract class Builder {
    public abstract Builder setSpicy(Spicy spicy);

    public abstract Builder setSize(Size size);

    public abstract Builder setOven(boolean oven);

    public abstract Food getFood();
}
