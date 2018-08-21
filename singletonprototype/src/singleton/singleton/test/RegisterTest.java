package singleton.singleton.test;

import singleton.LazySun;
import singleton.RegisterSun;

import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

/**
 * @author xuhangsong 2018/8/21
 */
public class RegisterTest {
    public static void main(String[] args) {
        int num = 100;
        CountDownLatch countDownLatch  = new CountDownLatch(num);
        for(int i=0;i<num;i++){
            new Thread(){
                @Override
                public void run() {
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(RegisterSun.getInstance());
                }
            }.start();
            countDownLatch.countDown();
        }
    }
}
