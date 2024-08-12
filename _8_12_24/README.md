[LeetCode Daily 703: Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/description/)

note: maintain a stream of integers and return the kth largest element.

brute force: use an array and sort the array every time an element is added and return the kth largest element.

time complexity: O(n log n), n is # of elements in the arr

optimal: use a min-heap (priority queue) with the size k. the top is always the kth largest element.

when add() is called do the following:

- if heap size is less than k, pq.offer
- else if peek is less than new number replace peek

time complexity: O(log k)
