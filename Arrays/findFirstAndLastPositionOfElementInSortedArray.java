package Arrays;
// using modified binary search

public class findFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
       
        int [] out = {-1, -1};
        
        if(nums.length == 0 || nums == null) {
            return out;
        }
        
        int firstPosition = firstPosition(nums, target);
        int lastPosition = lastPosition(nums, target);
        
        out[0] = firstPosition;
        out[1] = lastPosition;
        
        return out;
    }
        
        
        private static int firstPosition(int[] nums, int target) {
            
            int start = 0;
            int end = nums.length - 1;
            int firstPosition = -1; // here put -1 as per question
            
            
            while(start <= end) {
                int mid = start + (end - start)/2;
            
                if(target == nums[mid]) {
                    firstPosition = mid;
                    // going left
                    end = mid - 1;
                
                }
            
                else if(target > nums[mid]) {
                    start = mid + 1;
                }
            
                else {
                    end = mid - 1;
                }
            
            
            
        }
        
        return firstPosition;
    
        }
        
         
        private static int lastPosition(int[] nums, int target) {
            
            int start = 0;
            int end = nums.length - 1;
            int lastPosition = -1; // here put -1 as per question

             while(start <= end) {
            int mid = start + (end - start)/2;
            
            if(target == nums[mid]) {
                lastPosition = mid;
                // going right
                start = mid + 1;
                
            }
            
            else if(target > nums[mid]) {
                start = mid + 1;
            }
            
            else {
                end = mid - 1;
            }
            
            
            
        }
        
        return lastPosition;
    
        }
        
}
