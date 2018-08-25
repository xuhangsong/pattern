package template;

import strategy.Vehicle.VehicleType;

/**
 * @author xuhangsong 2018/8/25
 */
public class StudentShopping extends ShoppingTemplate {
    @Override
    public void intoShop() {
        System.out.println("进入文具店");
    }

    @Override
    public void chooseCommodity() {
        System.out.println("购买圆珠笔");
    }

    public StudentShopping(VehicleType vt) {
        super(vt);
    }

    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
