//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Rearr
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                temp.next = new Node(a);
                temp = temp.next;
            }
            
            Solution ob = new Solution();
            ob.rearrange(head);
            printLast(head);
            System.out.println();
        }
    }
    
    public static void printLast(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution
{
    public static void rearrange(Node odd)
    {
        // add your code here
        if(odd == null || odd.next == null) {
            return;
        }
        
        Node even = odd.next; // first even node
        Node currentOdd = odd;
        Node currentEven = even;
        
        while(currentEven != null && currentEven.next != null) {
            currentOdd.next = currentEven.next;
            currentOdd = currentOdd.next;
            
            if(currentOdd != null && currentOdd.next != null) {
                // now even
                currentEven.next = currentOdd.next;
                currentEven = currentEven.next;
            }
            
            else {
                currentEven.next = null;
                break;
            }
            
            
           
        }
        
        
        // once you have joinrd all odds and evens
        
        // reverse all evens
        
        even = reverseLL(even);
        
        // then append it to the end of odd
        currentOdd.next = even;
    }
    
    private static Node reverseLL(Node head) {
        if(head == null) {
            return head;
        }
        Node prev = null;
        Node current = head;
        Node next = current.next;
        
        while(current != null) {
            current.next = prev;
            prev = current;
            current = next;
            
            
            if(next != null) {
                next = next.next;
            }
        }
        
        return prev;
    }
}
