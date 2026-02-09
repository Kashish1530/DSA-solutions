1class Solution:
2    def divide(self, dividend: int, divisor: int) -> int:
3        INT_MAX = 2**31 - 1
4        INT_MIN = -2**31
5
6       
7        if dividend == INT_MIN and divisor == -1:
8            return INT_MAX
9
10        
11        negative = (dividend < 0) ^ (divisor < 0)
12
13     
14        dvd = abs(dividend)
15        dvs = abs(divisor)
16
17        result = 0
18
19        while dvd >= dvs:
20            temp = dvs
21            multiple = 1
22
23            
24            while dvd >= (temp << 1):
25                temp <<= 1
26                multiple <<= 1
27
28            dvd -= temp
29            result += multiple
30
31        return -result if negative else result