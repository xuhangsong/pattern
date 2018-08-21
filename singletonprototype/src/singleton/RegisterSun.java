package singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xuhangsong 2018/8/21
 */
public class RegisterSun {

    private RegisterSun(){}
    private static final Map<String,RegisterSun> map = new ConcurrentHashMap<String,RegisterSun>();

    public static final RegisterSun getInstance(){
        String key = RegisterSun.class.getName();
        if(!map.containsKey(key)){
            map.put(key,new RegisterSun());
        }
        return map.get(key);
    }
}
