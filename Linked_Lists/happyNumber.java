package Linked_Lists;

public class happyNumber {
    class Solution {
        public boolean isHappy(int n) {
            int fast = n;
            int slow = n;
            
            do {
               fast = findSquare(findSquare(fast));
                slow = findSquare(slow);
            } while(fast != slow);
            // when fast = slow, we get a linked list cycle and happy number cannot be found generally as it will keep on going in circles
            
            if (slow == 1) {
                return true;
            }
            return false;
        }
        
        private int findSquare(int no) {
            int ans = 0;
            while (no > 0) {
                int lastDigit = no % 10;
                ans += lastDigit * lastDigit;
                no /= 10;
            }
            
            return ans;
        }
    }
    
}


// The reason for using a do-while loop in this case is that it guarantees at least one iteration, allowing the algorithm to check for cycles. If the loop were a regular while loop (where the condition is checked before the first iteration), and n is already 1, the loop would never execute. Using a do-while loop ensures that the loop body executes at least once, allowing the algorithm to identify cycles even for cases where n starts as 1 or reaches 1 after one or more iterations.