package _8_14_24;

import java.util.Arrays;

class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);

        int l = 0;
        int r = nums[nums.length - 1] - nums[0];

        while (l < r) {
            int m = (l + r) / 2;
            if (countPairs(nums, m) < k) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        return l;
    }

    public int countPairs(int[] nums, int m) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            while (j < nums.length && nums[j] - nums[i] <= m) {
                j++;
            }
            count += j - i - 1;
        }
        return count;
    }

}