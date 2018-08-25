package strategy.Vehicle;

/**
 * @author xuhangsong 2018/8/24
 */
public enum VehicleType {
    TRAIN(new Train()),CAR(new Car()),Bike(new Bike());

    public Vehicle v;

    VehicleType(Vehicle v) {
        this.v = v;
    }


}
