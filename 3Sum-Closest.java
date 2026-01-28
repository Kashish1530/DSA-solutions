1import java.util.Arrays;
2
3class Solution {
4    public int threeSumClosest(int[] nums, int target) {
5        Arrays.sort(nums);
6        int n = nums.length;
7
8        int closestSum = nums[0] + nums[1] + nums[2];
9
10        for (int i = 0; i < n - 2; i++) {
11            int left = i + 1;
12            int right = n - 1;
13
14            while (left < right) {
15                int currentSum = nums[i] + nums[left] + nums[right];
16
17                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
18                    closestSum = currentSum;
19                }
20
21                if (currentSum < target) {
22                    left++;
23                } else if (currentSum > target) {
24                    right--;
25                } else {
26                    return currentSum;
27                }
28            }
29        }
30
31        return closestSum;
32    }
33}
34