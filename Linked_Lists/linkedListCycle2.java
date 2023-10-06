package Linked_Lists;

    /**
 * Definition for singly-linked list. */
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 

 // Floyd's Cycle Detection Algorithm 


public class linkedListCycle2 {


    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            // if there is a cycle, calculate its length
            if(fast == slow) {
                length = cycleLength(slow);
                break; // imp - stop when cycle is detected
            }
        }
        
        // edge case
        if(length == 0) {
            return null;
        }
        
        // tricky part - Phase 2: Find the starting node of the cycle
        ListNode f = head;
        ListNode s = head;
        

        // Move one pointer 'length' steps ahead
        while (length > 0) {
            s = s.next;
            length--;
            
        }
        
        // Move both pointers until they meet, which is the starting node of the cycle
        while (f != s) {
            f = f.next;
            s = s.next;
        }

        // Return the starting node of the cycle

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
