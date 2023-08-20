package Arrays;

public class rotateAnArrayByKTimes {
    
        public void rotate(int[] nums, int k) {
            // using 2 functions here
    
            int n = nums.length;
    
            k = k % n; // this ensures array does not repeat if k > n 
    
            // rotate part, reverse the indices here and not the elements
    
    
            // reverse all the indices
            reverseArray(nums, 0, n -1);
    
            // reverse the first k indices
            reverseArray(nums, 0, k - 1);
    
            // reverse the remaining n - k indices
            reverseArray(nums,k, n -1);
        }
    
    
        public static void reverseArray(int[] nums, int start, int end) {
            while(start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    
    
    /* The reason we use k = k % n is to handle cases where k is larger than the length of the array n. In the context of rotating an array, if k is greater than n, then rotating by k steps would be equivalent to rotating by k % n steps, because after rotating by n steps, the array returns to its original order.
    
    For example, consider an array [1, 2, 3, 4, 5] with a length of 5. If you want to rotate it by 7 steps, you can achieve the same result by rotating it by 7 % 5 = 2 steps. The array would look the same after either rotation.*/    
}
