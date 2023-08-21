package Arrays;

public class maximumProductSubArray {
    
        public int maxProduct(int[] nums) {
            // I'll use prefix and suffix method here
    
            // Video link: https://www.youtube.com/watch?v=hnswaLJvr6g
    
            int prefix = 1;  // from front to back
            int suffix = 1;  // from back to front
            int result = Integer.MIN_VALUE; // an arbitrary default minimum value 
            
    
            for(int i = 0; i < nums.length; i++) {
    
                // taking care of zeros
                if(prefix == 0) {
                    prefix = 1;
                }  
    
                if(suffix == 0) {
                    suffix = 1;
                }
                    // if we get a 0, we restart the subarray and make prefix/suffix to 1
                
                
                // multiply from the front to back
    
                prefix = prefix * nums[i];
    
                // multiply from back to front
    
                suffix = suffix * nums[nums.length - 1 - i];
    
                result = Math.max(result, Math.max(prefix, suffix)); 
                // choose which subarray is greater, be it prefix or suffix, pick the max out of one of them and compare it with result and find out the max between these two 
            }
    
            return result;
    
        }
    
}
