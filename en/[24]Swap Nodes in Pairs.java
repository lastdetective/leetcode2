//Given a linked list, swap every two adjacent nodes and return its head. 
//
// You may not modify the values in the list's nodes, only nodes itself may be changed. 
//
// 
//
// Example: 
//
// 
//Given 1->2->3->4, you should return the list as 2->1->4->3.
// 
//


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution24 {
    public ListNode swapPairs(ListNode head) {
        return swap(head);
    }

    ListNode swap(ListNode node1) {
        if (node1 == null || node1.next == null) {
            return node1;
        }
        ListNode node2 = node1.next;
        node1.next = swap(node1.next.next);
        node2.next = node1;
        return node2;
    }
}