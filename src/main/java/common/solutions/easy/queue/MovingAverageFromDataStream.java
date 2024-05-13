package common.solutions.easy.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverageFromDataStream {
    // Task 346. Moving Average from Data Stream https://leetcode.com/problems/moving-average-from-data-stream/
    private double sum = 0;
    private int size;

    private Queue<Double> queue = new LinkedList<>();
    ;


    public void MovingAverage(int size) {
        this.size = size;
    }

    public double next(int val) {
        if (queue.size() == size)
            sum -= queue.poll();
        sum += val;
        queue.add((double) val);
        return sum / queue.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */

