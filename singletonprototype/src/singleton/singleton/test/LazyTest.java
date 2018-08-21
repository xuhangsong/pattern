package singleton.singleton.test;

import singleton.LazySun;

import java.util.concurrent.CountDownLatch;

public class LazyTest {
    public static void main(String[] args) {
        int num = 200;
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
                    System.out.println(LazySun.getInstance());
                }
            }.start();
            countDownLatch.countDown();
        }
    }
}
