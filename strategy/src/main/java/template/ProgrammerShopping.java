package template;

import strategy.Vehicle.VehicleType;

/**
 * @author xuhangsong 2018/8/25
 */
public class ProgrammerShopping extends ShoppingTemplate{
    @Override
    public void intoShop() {
        System.out.println("进入书店");
    }

    @Override
    public void chooseCommodity() {
        System.out.println("选择java书籍");
    }

    @Override
    public void pay() {
        System.out.println("微信支付");
    }

    public ProgrammerShopping(VehicleType vt) {
        super(vt);
    }
}
