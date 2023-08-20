package Arrays;

public class cylindricallyRotateArrayByOne {

    
        public void rotate(int arr[], int n)
        {
            
            int k = 1;
         
    
            // rotate part, reverse the indices here and not the elements
    
    
            // reverse all the indices
            reverseArray(arr, 0, n -1);
    
            // reverse the first k indices
            reverseArray(arr, 0, k - 1);
    
            // reverse the remaining n - k indices
            reverseArray(arr,k, n -1);
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
    
}
