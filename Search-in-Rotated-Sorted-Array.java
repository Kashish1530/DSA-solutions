1class Solution {
2    public int search(int[] nums, int target) {
3     int left = 0, right = nums.length - 1;
4
5        while (left <= right) {
6            int mid = left + (right - left) / 2;
7
8            if (nums[mid] == target)
9                return mid;
10
11            if (nums[left] <= nums[mid]) {
12                if (target >= nums[left] && target < nums[mid])
13                    right = mid - 1;
14                else
15                    left = mid + 1;
16            }
17         
18            else {
19                if (target > nums[mid] && target <= nums[right])
20                    left = mid + 1;
21                else
22                    right = mid - 1;
23            }
24        }
25        return -1;   
26    }
27}