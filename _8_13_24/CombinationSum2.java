package _8_13_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    public void backtrack(int[] candidates, int target, int start, List<Integer> cur, List<List<Integer>> res) {

        if (target == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if (candidates[i] > target) {
                break;
            }

            cur.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, cur, res);
            cur.remove(cur.size() - 1);
        }
    }
}