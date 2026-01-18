1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3
4        // Ensure nums1 is the smaller array
5        if (nums1.length > nums2.length) {
6            return findMedianSortedArrays(nums2, nums1);
7        }
8
9        int m = nums1.length;
10        int n = nums2.length;
11
12        int low = 0, high = m;
13
14        while (low <= high) {
15            int cut1 = (low + high) / 2;
16            int cut2 = (m + n + 1) / 2 - cut1;
17
18            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
19            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
20
21            int right1 = (cut1 == m) ? Integer.MAX_VALUE : nums1[cut1];
22            int right2 = (cut2 == n) ? Integer.MAX_VALUE : nums2[cut2];
23
24            if (left1 <= right2 && left2 <= right1) {
25                // Correct partition found
26                if ((m + n) % 2 == 0) {
27                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
28                } else {
29                    return Math.max(left1, left2);
30                }
31            } 
32            else if (left1 > right2) {
33                high = cut1 - 1;
34            } 
35            else {
36                low = cut1 + 1;
37            }
38        }
39        return 0.0;
40    }
41}
42