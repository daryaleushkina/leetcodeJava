package common.solutions.easy.math;

public class FibonacciNumber {

    // Task 509. Fibonacci Number https://leetcode.com/problems/fibonacci-number
    public int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;

        int[] ans = new int[n + 1];
        ans[0] = 0;
        ans[1] = 1;
        for (int i = 2; i <= n; i++) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        return ans[n];

        // First solution
//        if (n<=1)
//            return n;
//        else return fib(n-1) + fib(n-2);


        // Second solution

        // int prevValue1 = 0;
        // int prevValue2 = 1;
        // int ans = 0;
        // for (int i = 0; i <= n; i++) {
        //     if (i == 0)
        //         ans=0;
        //     else if (i == 1)
        //         ans+=1;
        //     else if (i == 2){
        //         prevValue1 = 1;
        //         prevValue2 = 1;
        //     }
        //     else {
        //         ans+=prevValue1;
        //         prevValue1 = prevValue2;
        //         prevValue2 = ans;
        //     }
        // }
        // return ans;
    }
}
