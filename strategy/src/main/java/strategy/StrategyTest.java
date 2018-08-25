package strategy;

import strategy.Vehicle.VehicleType;

/**
 * @author xuhangsong 2018/8/24
 */
public class StrategyTest {
    public static void main(String[] args) {
        People p = new People();
        p.use(VehicleType.Bike);
        p.use(VehicleType.CAR);
        p.use(VehicleType.TRAIN);

    }
}
