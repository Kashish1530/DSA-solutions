1class Solution {
2    public ListNode swapPairs(ListNode head) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5
6        ListNode prev = dummy;
7
8        while (prev.next != null && prev.next.next != null) {
9            ListNode first = prev.next;
10            ListNode second = first.next;
11
12            first.next = second.next;
13            second.next = first;
14            prev.next = second;
15
16            prev = first;
17        }
18
19        return dummy.next;
20    }
21}
22