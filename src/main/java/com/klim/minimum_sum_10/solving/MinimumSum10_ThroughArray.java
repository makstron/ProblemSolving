package com.klim.minimum_sum_10.solving;

import com.klim.minimum_sum_10.Solve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumSum10_ThroughArray implements Solve {

    @Override
    public String getName() {
        return "Minimum Sum 10 - Through Array";
    }

    @Override
    public int run(List<Integer> num, int k) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(num);
        Collections.sort(numbers);
        Collections.reverse(numbers);
        int attempts = k;

        while(attempts > 0) {

            int i = 0;
            int firstResult = (int)Math.ceil((float)numbers.get(0) / 2);
            boolean firstTheSmalest = numbers.get(0) == 1;
            while (attempts > 0 && i < numbers.size() && (numbers.get(i) > firstResult || firstTheSmalest)) {
                int result = (int)Math.ceil((float)numbers.get(i) / 2);
                numbers.set(i, result);
                attempts--;
                i++;
            }
            Collections.sort(numbers);
            Collections.reverse(numbers);
        }

        return summ(numbers);
    }

    private static int summ(List<Integer> numbers) {
        int summ = 0;
        for (int i = 0; i < numbers.size(); i++) {
            summ+=numbers.get(i);
        }
        return summ;
    }

    private static void sout(List<Integer> array) {
        System.out.print("[");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(i+"-");
            System.out.print(array.get(i));
            System.out.print(" ");
        }
        System.out.println("]");
    }

}
