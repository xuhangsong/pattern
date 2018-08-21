package prototype;

/**
 * @author xuhangsong 2018/8/21
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Building b1 = new Building();
        Building b2 = (Building) b1.clone();
        System.out.println(b1.getMoney());
        System.out.println(b2.getMoney());
        System.out.println(b1.getUser());
        System.out.println(b2.getUser());
        System.out.println(b1);
        System.out.println(b2);

    }


}
