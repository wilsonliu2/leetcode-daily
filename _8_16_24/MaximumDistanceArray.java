package _8_16_24;

import java.util.List;

class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int max = arrays.get(0).get(0);
        int min = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxD = 0;

        for (int i = 0; i < arrays.size(); i++) {
            int curMax = arrays.get(i).get(arrays.get(i).size() - 1);
            int curMin = arrays.get(i).get(0);

            maxD = Math.max(maxD, Math.abs(curMax - min));
            maxD = Math.max(maxD, Math.abs(max - curMin));

            max = Math.max(max, curMax);
            min = Math.min(min, curMin);

        }
        return maxD;
    }
}