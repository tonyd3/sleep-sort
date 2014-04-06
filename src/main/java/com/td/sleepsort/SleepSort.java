package com.td.sleepsort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class SleepSort {
    public List<Integer> list;

    public SleepSort(List<Integer> list) {
        this.list = list;
    }

    public void sort() throws InterruptedException {
        List<Integer> sortedList = new ArrayList<>();
        CountDownLatch latch = new CountDownLatch(list.size());
        list.forEach(num -> new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(num * 1000);
                    sortedList.add(num);
                    latch.countDown();
                } catch (Exception e) {
                }
            }
        }.start());
        try {
            latch.await();
        } catch (Exception e) {
        }


        this.list = sortedList;
    }
}
