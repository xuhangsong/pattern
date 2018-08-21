package singleton.singleton.test;

import java.lang.reflect.Constructor;

/**
 * @author xuhangsong 2018/8/21
 */
public class ReflexTest {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("singleton.LazySun");
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
