package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class intersectionOfTwoArrays2 {

    
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // Using 2 pointer approach here
        // Also using ArrayList and getting out array output from arraylist

        ArrayList<Integer> list = new ArrayList<>();

        // We are not using a for loop here as we want to work on both loops simultaneously and not use nested for loops, hence we'll use a while loop
        int i = 0;
        int j = 0;

        while(i < nums1.length && j < nums2.length) {

            if(nums1[i] == nums2[j]) {
                    list.add(nums1[i]);

                    // imp line, increment both if they are equal
                    i++;
                    j++;
                }

                // edge cases

                else if(nums1[i] > nums2[j]) {
                    j++;
                }

                else {
                    i++;
                }

        }       

        // Getting the array return from arraylist

        // imp code bit
        int[] result = new int[list.size()]; // parenthesis is imp here after size
        for(int k = 0; k < result.length; k++) {
            result[k] = list.get(k);  // imp line
        }

        return result;
    }   
}
