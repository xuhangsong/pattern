package strategy.Vehicle;

/**
 * @author xuhangsong 2018/8/24
 */
public class Train implements Vehicle{
    @Override
    public void run() {
        System.out.println("train run by electric");
    }
}
