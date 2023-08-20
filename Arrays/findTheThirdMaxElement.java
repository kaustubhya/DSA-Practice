package Arrays;

public class findTheThirdMaxElement {
    
        public int thirdMax(int[] nums) {
            
            Integer firstMax = null;
             Integer secondMax = null;
             Integer thirdMax = null;
    
            // we can't use 'int firstMax = null' as it would give us an error
    
            for(Integer num : nums) { // same case, use integer here 
            
            
                // Dealing with duplicates
    
                if(num.equals(firstMax) || num.equals(secondMax) || num.equals(thirdMax)) {
                    continue;  // skip duplicates
                }
    
                if((firstMax == null) || num > firstMax) {
                    thirdMax = secondMax;
                    secondMax = firstMax;
                    firstMax = num;
                }
    
                else if((secondMax == null) || num > secondMax) {
                    thirdMax = secondMax;
                    secondMax = num;   
                }
    
                else if((thirdMax == null) || num > thirdMax) {
                    thirdMax = num;
                }
    
    
            }
    
            // Returning the third largest element -  if it exists or the returning the largest element
    
            if(thirdMax != null) {
                return thirdMax;
            }
    
            else {
                return firstMax;
            }        
        }
    
    
}
