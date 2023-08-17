package Arrays;

public class moveZerosToEnd {
    
    
        public void moveZeroes(int[] nums) {
    // Using a 2 pointer approach
            int slow = 0;
    
            for(int fast = 0; fast <  nums.length; fast++) {
    
                if(nums[fast] != 0) {
    
                    // Special Swapping 
                   int temp = nums[slow];
                   nums[slow] = nums[fast];
                   nums[fast] = temp;
    
    
                   slow++;
                }
    
    
            }
            
        }
    
    
    // Explaination
    
    /*Initially, we have the array: [0, 1, 0, 3, 12]
    
    We'll use two pointers, slow and fast, to traverse the array:
    
    Initialize slow = 0 and fast = 0.
    
    As long as fast is less than the length of the array, we'll perform the following steps:
    
    At fast = 0, we encounter 0. Since it's a zero, we don't swap anything, and we simply move fast to the next position.
    
    Array: [0, 1, 0, 3, 12] (no change)
    
    At fast = 1, we encounter 1. Since it's not a zero, we swap nums[slow] and nums[fast] and increment slow.
    
    Array after swapping: [1, 0, 0, 3, 12], slow = 1, fast = 2
    
    At fast = 2, we encounter another 0. Since it's a zero, we don't swap anything and just move fast to the next position.
    
    Array: [1, 0, 0, 3, 12] (no change)
    
    At fast = 3, we encounter 3. Since it's not a zero, we swap nums[slow] and nums[fast] and increment slow.
    
    Array after swapping: [1, 3, 0, 0, 12], slow = 2, fast = 4
    
    Finally, at fast = 4, we encounter 12. Since it's not a zero, we swap nums[slow] and nums[fast] and increment slow.
    
    Array after swapping: [1, 3, 12, 0, 0], slow = 3, fast = 5 (loop terminates)
    
    After the loop terminates, we know that all non-zero elements are at the beginning of the array up to index slow - 1. So, we fill the remaining positions with zeroes:
    
    Array after filling with zeroes: [1, 3, 12, 0, 0] */
}
