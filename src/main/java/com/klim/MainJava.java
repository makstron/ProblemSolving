package com.klim;

import com.klim.minimum_sum_10.solving.MinimumSum10_PriorityQueue;
import com.klim.minimum_sum_10.MinimumSum10Tests;
import com.klim.minimum_sum_10.solving.MinimumSum10_ThroughArray;

public class MainJava {

    public static void main(String[] args) {

        minimumSum10();

    }

    public static void minimumSum10() {
        MinimumSum10Tests tests = new MinimumSum10Tests();

        MinimumSum10_PriorityQueue minimumSum10PriorityQueue = new MinimumSum10_PriorityQueue();
        MinimumSum10_ThroughArray minimumSum10_ThroughArray = new MinimumSum10_ThroughArray();

        tests.runAllFor(minimumSum10PriorityQueue);
        tests.runAllFor(minimumSum10_ThroughArray);
    }

}
