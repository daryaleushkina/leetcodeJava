package common.solutions.easy.slidingwindow;

public class MinimumRecolors {
    // Task 2379. Minimum Recolors to Get K Consecutive Black Blocks https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/

    public int minimumRecolors(String blocks, int k) {
        StringBuilder str = new StringBuilder(blocks.substring(0, k));
        short count = 0;
        int min = k;
        for (char c : str.toString().toCharArray()) {
            if (c == 'B')
                count++;
            if (count == k)
                return 0;
        }
        if (min > (k - count))
            min = k - count;

        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'B' ) {
                if (blocks.charAt(i - k) != 'B') {
                    count++;
                    if (min > (k - count))
                        min = k - count;
                }
            } else if (blocks.charAt(i - k) == 'B')
                count--;
            if (count == k)
                return 0;
        }


        return Math.min(min, k - count);
    }
}
