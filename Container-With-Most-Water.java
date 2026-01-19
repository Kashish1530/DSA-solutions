1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0;
4        int right = height.length - 1;
5        int maxArea = 0;
6
7        while (left < right) {
8            int h = Math.min(height[left], height[right]);
9            int width = right - left;
10            maxArea = Math.max(maxArea, h * width);
11
12            if (height[left] < height[right]) {
13                left++;
14            } else {
15                right--;
16            }
17        }
18
19        return maxArea;
20    }
21}
22