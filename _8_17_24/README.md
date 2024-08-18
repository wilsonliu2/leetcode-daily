## [1937. Maximum Number of Points with Cost](https://leetcode.com/problems/maximum-number-of-points-with-cost/description/)

note: start from any column and move down row by row, there is a cost and have to get the most points.

1. create an array dp to represents the max points.
2. initialize the dp with the value from the first row. this is the first row so no cost.
3. calcuate points by moving left to right and right to left. and update dp with the max you get from either approach

time complexity: O(r \* c)
