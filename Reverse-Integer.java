1class Solution {
2    public int reverse(int x) {
3        int INT_MAX = Integer.MAX_VALUE; 
4        int INT_MIN = Integer.MIN_VALUE; 
5
6        int rev = 0;
7
8        while (x != 0) {
9            int digit = x % 10;
10            x = x / 10; 
11            if (rev > INT_MAX / 10 || (rev == INT_MAX / 10 && digit > 7)) {
12                return 0;
13            }
14            if (rev < INT_MIN / 10 || (rev == INT_MIN / 10 && digit < -8)) {
15                return 0;
16            }
17
18            rev = rev * 10 + digit;
19        }
20
21        return rev;
22    }
23}
24