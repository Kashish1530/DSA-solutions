1class Solution {
2    public String countAndSay(int n) {
3        if (n == 1) return "1";
4        
5        String result = "1";
6        
7        for (int i = 2; i <= n; i++) {
8            StringBuilder current = new StringBuilder();
9            int count = 1;
10            
11            for (int j = 1; j < result.length(); j++) {
12                if (result.charAt(j) == result.charAt(j - 1)) {
13                    count++;
14                } else {
15                    current.append(count);
16                    current.append(result.charAt(j - 1));
17                    count = 1;
18                }
19            }
20            
21            current.append(count);
22            current.append(result.charAt(result.length() - 1));
23            
24            result = current.toString();
25        }
26        
27        return result;  
28    }
29}