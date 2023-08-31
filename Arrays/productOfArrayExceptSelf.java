package Arrays;

public class productOfArrayExceptSelf {
    
        public int[] productExceptSelf(int[] nums) {
            int productLeft = 1;
            int productRight = 1;
            int[] result = new int[nums.length];
            int[] resultLeft = new int[nums.length];
            int[] resultRight = new int[nums.length];  
    
    
                for(int i = 0; i < nums.length; i++) {
                     resultLeft[i] = productLeft;
    
                    productLeft *= nums[i];
                }
    
                for(int i = nums.length - 1; i >= 0; i--) {
                   
                    // store in array
                    resultRight[i] = productRight;
                    // move to next iteration
                    productRight *= nums[i];
    
                result[i] = resultLeft[i] * resultRight[i];  // imp think about this line of code
    
    
                }
            
    
            return result;
        }    
    
    // if we use 2 for loops then TC = O(n^2), hence use 2 different arrays to store multiplied values and then multiply them, hence TC = O(n)
}
