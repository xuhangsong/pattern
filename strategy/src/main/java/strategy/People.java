package strategy;

import strategy.Vehicle.Vehicle;
import strategy.Vehicle.VehicleType;

/**
 * @author xuhangsong 2018/8/24
 */
public class People {

    public People() {
    }
    public void use(VehicleType type){
        type.v.run();
    }
}
