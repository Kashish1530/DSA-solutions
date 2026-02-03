1class Solution {
2    public int mySqrt(int x) {
3        if (x < 2) {
4            return x;
5        }
6
7        int left = 1, right = x / 2;
8        int ans = 0;
9
10        while (left <= right) {
11            int mid = left + (right - left) / 2;
12
13            if ((long) mid * mid <= x) {
14                ans = mid;
15                left = mid + 1;
16            } else {
17                right = mid - 1;
18            }
19        }
20
21        return ans;
22    }
23}