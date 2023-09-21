package Arrays;

public class jumpGame {
    
        public boolean canJump(int[] nums) {
            // the goal is to reach the last index and maxReach is the fuel needed to reach the last index, it is not necessary to use all of maxReach to reach the last index, be careful that that the fuel does not get exhausted before you reach the last index
           int n = nums.length;
            int maxReach = 0;
            
            for(int i = 0; i < n; i++) {
                if(i > maxReach) {
                    // you cannot reach this position i if you use maxReach, i.e. fuel exhausted
                    return false;
                }
                
                maxReach = Math.max(maxReach, nums[i] + i);
                // looking from the starting index, we see how much maxReach potential we can have from the currentIndex if we were to reach the last index
                
            }
            
             return true;
    
        }
    
        
    
}
