package Linked_Lists;

public class Linked_List_Reversal {
    // Reversing the Linked List 'In Place' (Iterative Method)

//   Definition for singly-linked list.
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 

    public ListNode reverseList(ListNode head) {
    // using prev, current and next pointers
    // given only head, no tail
        
        // edge case
        if(head == null) {
            return head;
            // manage the next node as here current = null = head so next will give error as next will be after null
        }

    ListNode prev = null;
    ListNode current = head;
    ListNode next = current.next;

    while(current != null) {
        current.next = prev;
        prev = current;
        current = next;

        if(next != null) {
            next = next.next;
        }
    }

    return prev;
    // if we return prev here and enter head in the function argument, we will get a reversed linked list

    }

}

// TC = O(n)
// SC = O(1)