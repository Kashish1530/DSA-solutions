1class Solution {
2    public int myAtoi(String s) {
3
4        int i = 0;
5        int n = s.length();
6        int sign = 1;
7        int result = 0;
8
9        while (i < n && s.charAt(i) == ' ') {
10            i++;
11        }
12
13        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
14            sign = (s.charAt(i) == '-') ? -1 : 1;
15            i++;
16        }
17
18        while (i < n && Character.isDigit(s.charAt(i))) {
19            int digit = s.charAt(i) - '0';
20
21            if (result > Integer.MAX_VALUE / 10 ||
22               (result == Integer.MAX_VALUE / 10 && digit > 7)) {
23                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
24            }
25
26            result = result * 10 + digit;
27            i++;
28        }
29
30        return result * sign;
31    }
32}
33