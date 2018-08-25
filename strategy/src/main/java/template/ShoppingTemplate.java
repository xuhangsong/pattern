package template;

import strategy.Vehicle.Vehicle;
import strategy.Vehicle.VehicleType;

/**
 * @author xuhangsong 2018/8/24
 */
public abstract class ShoppingTemplate {
    private VehicleType vt ;
    public abstract void intoShop();
    public abstract void chooseCommodity();
    public abstract  void pay();

    public ShoppingTemplate(VehicleType vt) {
        this.vt = vt;
    }

    public void goBackHome(){
        vt.v.run();
    }

    public final void shopping(){
        this.intoShop();
        this.chooseCommodity();
        this.pay();
        this.goBackHome();

    }
}
