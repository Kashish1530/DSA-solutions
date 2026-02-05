1class Solution {
2    public boolean isSameTree(TreeNode p, TreeNode q) {
3        if (p == null && q == null) {
4            return true;
5        }
6
7        if (p == null || q == null || p.val != q.val) {
8            return false;
9        }
10
11        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
12    }
13}
14