package common.solutions.easy.queue;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {
    // Task 933. Number of Recent Calls https://leetcode.com/problems/number-of-recent-calls/
    private Queue<Integer> queue;

    public void RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        // Удаляем запросы, которые были сделаны более 3000 миллисекунд назад
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
}
