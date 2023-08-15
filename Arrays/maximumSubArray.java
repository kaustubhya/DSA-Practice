package Arrays;

public class maximumSubArray {
    
        public int maxSubArray(int[] nums) {
    
            // Using Kadane's Algorithm here'
            int maxSubArrayEndingHere = nums[0];
            int maxValueSoFar = nums[0];
    
            for (int i = 1; i < nums.length; i++) { // start loop from 1 imp
                maxSubArrayEndingHere = Math.max(nums[i], maxSubArrayEndingHere + nums[i]);
                maxValueSoFar = Math.max(maxValueSoFar, maxSubArrayEndingHere);
    
    
            }
    
            return maxValueSoFar;
        }   
    
    // Theory on Kadane's Algorithm 
    
    // for loop explaination:
    
    /* Starting the loop from i = 1 in the Kadane's algorithm is a key aspect of the algorithm's design. Let's break down why we start the loop from index 1 instead of index 0.
    
    In Kadane's algorithm, we are interested in finding the maximum subarray sum ending at each index i. This means we want to consider all possible subarrays that end at index i.
    
    If we start the loop from index 0, we would only be considering subarrays that start from index 0 and end at index i, which would not cover all possibilities. In other words, we would not be considering subarrays that start at an index greater than 0. This would lead to an incorrect result.
    
    By starting the loop from i = 1, we ensure that we are considering all subarrays that end at index i, including subarrays that start at previous indices and extend to index i. This way, we cover all possibilities and can accurately calculate the maximum subarray sum ending at each index.
    
    
    
    Explaination of: 
                maxSubArrayEndingHere = Math.max(nums[i], maxSubArrayEndingHere + nums[i]);
    
    So, the line of code essentially compares two values:
    
    nums[i]: This is the value of the current element. If it's greater than the sum of the previous subarray plus the current element, then it might make sense to start a new subarray at index i.
    maxEndingHere + nums[i]: This is the sum of the previous subarray plus the current element. If it's greater than just the current element, then it indicates that extending the previous subarray by including the current element would lead to a larger subarray sum.
    By using Math.max(nums[i], maxEndingHere + nums[i]), we choose the larger value of these two options, ensuring that maxEndingHere always represents the maximum sum of subarrays ending at index i.
    
    Explaination:
    maxValueSoFar = Math.max(maxValueSoFar, maxEndingHere or maxSubArrayEndingHere):
    
    This line updates the overall maximum subarray sum encountered so far.
    maxValueSoFar keeps track of the maximum sum among all the subarrays that have been processed so far.
    maxEndingHere contains the maximum sum of subarrays ending at index i.
    This comparison ensures that if the current subarray sum ending at index i is greater than the overall maximum encountered so far, we update maxSoFar with this new maximum. */
}
