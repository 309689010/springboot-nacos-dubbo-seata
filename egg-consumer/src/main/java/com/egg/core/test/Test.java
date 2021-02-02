package com.egg.core.test;

import org.springframework.util.StringUtils;

import java.util.Optional;

public class Test {

    public static void main(String args[]) {
        Lombok lombok = new Lombok();
        lombok.setUserId("213");
        lombok.setUserName("sdaa");

        Lombok lombok2 = new Lombok();
        lombok2.setUserId("213");
        lombok2.setUserName("sdaa");


        Lombok.inLog();
        System.out.println("lombok1： " + lombok.hashCode());
        System.out.println("lombok2： " + lombok2.hashCode());
        System.out.println("lombok1 eq lombok2： " + lombok.equals(lombok2));

        /*LocalDate now = LocalDate.now();
        System.out.println(now.getDayOfMonth());*/


        /*ThreadPoolExecutor threadPool = new ThreadPoolExecutor(20, 20, 0,
                TimeUnit.MINUTES, new LinkedBlockingQueue<>(),
                new ThreadPoolExecutor.AbortPolicy());
        Long start = System.currentTimeMillis();
        System.out.println("start :" + start);
        for(int i=0; i<2000; i++) {
            int finalI = i;
            while (threadPool.getActiveCount() >= threadPool.getMaximumPoolSize()) {
                try {
                    System.out.println("sleep...........");
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            threadPool.execute(() -> {
                test(finalI + 1);
            });

        }
        Long end = System.currentTimeMillis();
        System.out.println("end :" + end + " use time: " + (end - start));*/
    }

    public static void test(Integer max) {
//        System.out.println("************   max: " + max);
        for (int i=0; i<max; i++) {
            System.out.println("i: " + i);
        }
    }
}
