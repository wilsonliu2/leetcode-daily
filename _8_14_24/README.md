[LeetCode Daily: 719. Find K-th Smallest Pair Distance](https://leetcode.com/problems/find-k-th-smallest-pair-distance/description/)

note: given array nums and int k. find the kth smallest absolute difference between any 2 elements in the array.
use binary search.

1. sort array for binary search
2. use the range, 0 and the max difference (nums[length] - nums[0]);. narrow the search space down by counting how many pairs have a difference less or equal to the midpoint
3. countPairs count the number of pairs in the array that have a difference less than or equal to the value.
4. when it is reduced to 1 value is the kth smallest distance

time complexity: O(n log(max-diff) + nlogn)
binary search takes log(max-diff), counting pairs takes n, sorting takes nlogn
