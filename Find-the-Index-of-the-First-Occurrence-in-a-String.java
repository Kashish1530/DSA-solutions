1class Solution {
2    public int strStr(String haystack, String needle) {
3      if (needle.length() == 0) return 0;
4
5        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
6            if (haystack.substring(i, i + needle.length()).equals(needle)) {
7                return i;
8            }
9        }
10        return -1;  
11    }
12}