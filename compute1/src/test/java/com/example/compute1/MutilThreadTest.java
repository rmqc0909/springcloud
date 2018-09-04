package com.example.compute1;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CountDownLatch 模拟高并发
 * await() 方法是线程阻塞，直到计数器为0，才会启动；
 * countDown() 方法使计数器减1。
 */
public class MutilThreadTest {
    public static void main(String[] args) throws InterruptedException {
        latchTest();
    }

    private static Integer poolSize = 100;


    private static void latchTest() throws InterruptedException {
        final CountDownLatch start = new CountDownLatch(1);
        final CountDownLatch end = new CountDownLatch(poolSize);
        ExecutorService exce = Executors.newFixedThreadPool(poolSize);
        long time = System.currentTimeMillis();
        for (int i = 0; i < poolSize; i++)  {
            Runnable run = () -> {
                try {
                    System.out.println("============ before ");
                    start.await();
                    long endTime = System.currentTimeMillis() - time;
                    System.out.println("============ interval " + endTime);
                    testLoad();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    end.countDown();
                }
            };
            exce.submit(run);
        }
        start.countDown();
        end.await();
        exce.shutdown();
    }

    /**
     * 需要测试并发的方法
     */
    private static void testLoad() {
        System.out.println("============ ");
    }
}
