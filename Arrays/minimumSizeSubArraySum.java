package Arrays;

public class minimumSizeSubArraySum {
    
        public int minSubArrayLen(int target, int[] nums) {
          int n = nums.length;
          int left = 0;
          int minLength = Integer.MAX_VALUE;
          int subArraySum = 0;
    
          // 2 pointers
    
          for(int right = 0; right < n; right++) {
              subArraySum += nums[right];
    
              while(subArraySum >= target) {
                  minLength = Math.min(minLength, right - left + 1); // imp as arrays start from zero
                  // work done, now for the future
                  subArraySum = subArraySum - nums[left];
                  left++;
    
              }
          }
    
    
          if(minLength != Integer.MAX_VALUE) {
              return minLength;
          }
    
          else {
              return 0;
          }
    
    
        }
    
    
    // while loop working
    
    /*Initially, the left pointer is at the start of the array and the right pointer is moving forward.
    As the right pointer moves, the currentSum keeps track of the sum of elements between the left and right pointers.
    When the currentSum becomes greater than or equal to the target, it means we have a subarray that meets the condition.
    At this point, we update minLength with the minimum length of subarrays we've encountered so far.
    We then move the left pointer to the right, effectively contracting the window from the left side. This reduces the sum, so the currentSum might become less than the target.
    We repeat the process, moving the right pointer forward and checking if the currentSum is greater than or equal to the target.
    If the condition is met again, we update minLength and contract the window by moving the left pointer again.
    We continue this process until the right pointer reaches the end of the array.*/
}
