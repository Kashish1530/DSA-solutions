1class Solution {
2    public String convert(String s, int numRows) {
3
4        if (numRows == 1 || s.length() <= numRows) {
5            return s;
6        }
7
8        StringBuilder[] rows = new StringBuilder[numRows];
9        for (int i = 0; i < numRows; i++) {
10            rows[i] = new StringBuilder();
11        }
12
13        int currentRow = 0;
14        boolean goingDown = false;
15
16        for (char c : s.toCharArray()) {
17            rows[currentRow].append(c);
18
19            if (currentRow == 0 || currentRow == numRows - 1) {
20                goingDown = !goingDown;
21            }
22
23            currentRow += goingDown ? 1 : -1;
24        }
25
26        StringBuilder result = new StringBuilder();
27        for (StringBuilder row : rows) {
28            result.append(row);
29        }
30
31        return result.toString();
32    }
33}
34