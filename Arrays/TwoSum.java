package Arrays;



class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];

        for(int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int el1 = nums[i];
                int el2 = nums[j];

                if((el1 + el2) == target) {
                    result[0] = i; // Array starts from 0
                    result[1] = j;

                    return result; // this line's positioning should be inside if, else we get edge cases'
                }

                
            }
            

        }

        return result;  // default value of array if no solution is found
    }
}