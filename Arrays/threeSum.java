package Arrays;

import java.util.*;


public class threeSum {
    
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        
        // sorting the array to handle duplicates
        Arrays.sort(nums);
        
        for(int i = 0; i < n; i++) {
            
            // removing i duplicates
            if(i != 0 && nums[i] == nums[i-1]) {
                continue;
            }
        
            // one fixed pointer i, 2 moving pointers j
            int j = i+1; // start
            int k = n-1; // end
        
        while(j < k) {
            int sum = nums[i] + nums[j] + nums[k];
            
            if (sum > 0) {
                k--;
            }
            
            else if (sum < 0) {
                j++;
            }
            
            else {
                // sum == 0
                // Creating a scratch pad list
                
                // imp
                List<Integer> scratchPad = Arrays.asList(nums[i], nums[j], nums[k]);
                ans.add(scratchPad);
               
                // moving forward
                j++;
                k--;
                
                // skipping the duplicates
                while (j < k && nums[j] == nums[j - 1]) {
                    j++;
                }
                while(j < k && nums[k] == nums[k + 1]) {
                    k--;
                }
            }

        }
        }
        
        return ans;
    }
}

//  doing while(j <= k) may give duplicate triplets which may be wrong

