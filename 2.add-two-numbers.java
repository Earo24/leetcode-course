/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class AddTwoNumbersSolution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode returnData = new ListNode(0);
        ListNode root = returnData;
        int carry = 0;
        do {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            if (sum / 10 > 0) {
                carry = 1;
            } else {
                carry = 0;
            }
            root.next = new ListNode(sum % 10);
            root = root.next;
        } while (l1 != null || l2 != null);
        if (carry > 0) {
            root.next = new ListNode(carry);
        }
        return returnData.next;
    }
}
