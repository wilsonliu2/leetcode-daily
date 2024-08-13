[LeetCode Daily 40: Combination Sum II](https://leetcode.com/problems/combination-sum-ii/description/)

note: given an array of numbers, find all numbers that sum to the target. no duplicates.

1. sort the array to better handle duplicates
2. use backtrack to find all possible combinations

- skip duplicates by checking if previous candidates is the same
- if the sum equals to the target. add that to the result list
- if current candidates will exceed the target value break from the loop

time complexity: O(2^n), in the worst case each candidate can either be included or not.
