## [264. Ugly Number II](https://leetcode.com/problems/ugly-number-ii/description/)

find the nth ugly number. ugly number are positive number that are factors of 2 or 3 or 5

init array to store the nth ugly number.
first ugly number is 1
init 3 indices i2, i3, i5 to track position of next multiple of 2, 3, and 5

next2, next3, next5 represents the next possible number

from index i to n-1. find the next ugly number by finding the min of next2-5

update the index (i2, i3, i5) to calculate the new next2, next3, next5.

time: O(n)
