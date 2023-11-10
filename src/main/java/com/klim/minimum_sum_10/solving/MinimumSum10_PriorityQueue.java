package com.klim.minimum_sum_10.solving;

import com.klim.minimum_sum_10.Solve;

import java.util.List;
import java.util.PriorityQueue;

public class MinimumSum10_PriorityQueue implements Solve {

    @Override
    public String getName() {
        return "Minimum Sum 10 - Through PriorityQueue";
    }

    @Override
    public int run(List<Integer> num, int k) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>((first, second) -> second - first);
        for (int i = 0; i < num.size(); i++) {
            numbers.add(num.get(i));
        }

        int attempts = k;
        while (attempts > 0) {
            int number = numbers.poll();
            int result = (int) Math.ceil((float) number / 2);
            numbers.add(result);

            attempts--;
        }

        int summ = 0;
        while (numbers.size() > 0) {
            int a = numbers.poll();
            summ += a;
        }

        return summ;
    }

}
