package Arrays;

public class findMissingNumber {

        public int missingNumber(int[] nums) {
            int n = nums.length;
            int totalSum = (n*(n + 1))/2;  // Formula, sum of n nos.
            int sums = 0;
    
            for (int i = 0; i < nums.length; i++) {
                sums += nums[i];
    
            }
    
            int result = totalSum - sums;  // sum of n nos. - sum of array digits = missing no.
    
            return result;
        }
    
    
}
