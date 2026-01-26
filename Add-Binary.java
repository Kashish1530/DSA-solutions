1class Solution {
2    public String addBinary(String a, String b) {
3         int i = a.length() - 1;
4        int j = b.length() - 1;
5        int carry = 0;
6
7        StringBuilder result = new StringBuilder();
8
9        while (i >= 0 || j >= 0 || carry == 1) {
10            int sum = carry;
11
12            if (i >= 0) {
13                sum += a.charAt(i) - '0';
14                i--;
15            }
16            if (j >= 0) {
17                sum += b.charAt(j) - '0';
18                j--;
19            }
20
21            result.append(sum % 2);
22            carry = sum / 2;
23        }
24
25        return result.reverse().toString();
26    }
27}