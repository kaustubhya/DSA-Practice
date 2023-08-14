package Arrays;

class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        
        // Edge Cases
        if(nums.length == 0) {
            return 0;
        }
        int size = 1; // minimum size, this will be the size of the array without duplicates

        // Using 2 pointers here, 1 pointer for nums, another for an imaginary array whose length is equal to size

        for(int i = 1; i < nums.length; i++) {  // As we do i & i - 1, start loop from 1 to include 1 and 0
            if(nums[i] != nums[i - 1]) { // imp line
            nums[size] = nums[i]; // put the non duplicate element of nums in this new array size's empty space
                size++; // emptying new space

            }
        }

        return size;
    }
}