package strategy.Vehicle;

/**
 * @author xuhangsong 2018/8/24
 */
public class Car implements Vehicle{
    @Override
    public void run() {
        System.out.println("car run by oil");
    }
}
