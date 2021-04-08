package com.string;

import java.util.ArrayList;
import java.util.List;

public class StaticTest {
    public List<Double> list = new ArrayList<>();

    public void populateList() {
        for (int i = 0; i < 10000000; i++) {
            list.add(Math.random());
        }
        //Log.info("Debug Point 2");
    }

    public static void main(String[] args) {
       // Log.info("Debug Point 1");
        new StaticTest().populateList();
        System.out.println();
       // Log.info("Debug Point 3");
    }
}
