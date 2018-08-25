package template;

import strategy.Vehicle.VehicleType;

/**
 * @author xuhangsong 2018/8/25
 */
public class TemplateTest {
    public static void main(String[] args) {
        new StudentShopping(VehicleType.Bike).shopping();
        new ProgrammerShopping(VehicleType.TRAIN).shopping();
    }
}
