/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// Floyd's Cycle Detection Algorithm 

public class Solution {
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow) {
                length = cycleLength(slow);
                break; // imp
            }
        }
        
        // edge case
        if(length == 0) {
            return null;
        }
        
        // tricky part
        ListNode f = head;
        ListNode s = head;
        
        while (length > 0) {
            s = s.next;
            length--;
            
        }
        
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }
    
    public int cycleLength(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow) {
                ListNode temp = head;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while(temp != slow);
                return length;
            }
        }
        return 0;
    }
}