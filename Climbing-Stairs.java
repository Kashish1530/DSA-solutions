1class Solution {
2    public int climbStairs(int n) {
3       if (n <= 2) {
4            return n;
5        }
6
7        int prev2 = 1; 
8        int prev1 = 2; 
9        for (int i = 3; i <= n; i++) {
10            int curr = prev1 + prev2;
11            prev2 = prev1;
12            prev1 = curr;
13        }
14
15        return prev1; 
16    }
17}