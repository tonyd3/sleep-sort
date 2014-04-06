package com.td.sleepsort;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class SleepSortTest extends TestCase {
    public void testBaseCase() {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(6);
        list.add(0);
        list.add(5);
        SleepSort sleepSort = new SleepSort(list);
        try {
            sleepSort.sort();
            assertEquals(new Integer(0), sleepSort.list.get(0));
            assertEquals(new Integer(1), sleepSort.list.get(1));
            assertEquals(new Integer(2), sleepSort.list.get(2));
            assertEquals(new Integer(3), sleepSort.list.get(3));
            assertEquals(new Integer(4), sleepSort.list.get(4));
            assertEquals(new Integer(5), sleepSort.list.get(5));
            assertEquals(new Integer(6), sleepSort.list.get(6));
            assertEquals(new Integer(7), sleepSort.list.get(7));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
